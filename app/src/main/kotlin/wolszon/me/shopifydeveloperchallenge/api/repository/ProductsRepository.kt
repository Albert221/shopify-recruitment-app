package wolszon.me.shopifydeveloperchallenge.api.repository

import io.reactivex.Single
import wolszon.me.shopifydeveloperchallenge.api.model.Product

interface ProductsRepository {
    fun getProductsInCollection(collectionId: Long): Single<List<Product>>
}