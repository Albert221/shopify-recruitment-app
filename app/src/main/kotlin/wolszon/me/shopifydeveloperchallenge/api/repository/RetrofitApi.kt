package wolszon.me.shopifydeveloperchallenge.api.repository

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import wolszon.me.shopifydeveloperchallenge.api.response.CollectsResponse
import wolszon.me.shopifydeveloperchallenge.api.response.CustomCollectionsResponse
import wolszon.me.shopifydeveloperchallenge.api.response.ProductsResponse

interface RetrofitApi {
    @GET("/admin/custom_collections.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6")
    fun getCustomCollections(): Single<CustomCollectionsResponse>

    @GET("/admin/collects.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6")
    fun getCollects(@Query("collection_id") collectionIds: String): Single<CollectsResponse>

    @GET("/admin/products.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6")
    fun getProducts(@Query("ids") productIds: String): Single<ProductsResponse>
}