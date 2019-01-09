package wolszon.me.shopifydeveloperchallenge.api.repository

import io.reactivex.Single
import retrofit2.Retrofit
import wolszon.me.shopifydeveloperchallenge.api.mapper.ProductMapper
import wolszon.me.shopifydeveloperchallenge.api.model.Product

class RetrofitProductsRepository(private val retrofit: Retrofit) : ProductsRepository {
    private val retrofitApi: RetrofitApi by lazy { retrofit.create(RetrofitApi::class.java) }

    override fun getProductsInCollection(collectionId: Long): Single<List<Product>> {
        return retrofitApi
            .getCollects(collectionId.toString())
            .map { it.collects }
            .map { collect -> collect.map { it.productId } }
            .flatMap {
                val productIds = it.joinToString()

                retrofitApi.getProducts(productIds)
            }
            .map { it.products }
            .map { products -> products.map { ProductMapper.map(it) } }
    }
}