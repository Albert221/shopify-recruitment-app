package wolszon.me.shopifydeveloperchallenge.api.repository

import io.reactivex.Single
import retrofit2.Retrofit
import wolszon.me.shopifydeveloperchallenge.api.model.Collection

class RetrofitCollectionsRepository(private val retrofit: Retrofit) : CollectionsRepository {
    private val retrofitApi: RetrofitApi by lazy { retrofit.create(RetrofitApi::class.java) }

    override fun getCustomCollections(): Single<List<Collection>> {
        val result = retrofitApi.getCustomCollections()

        return result
            .map {
                it.customCollections.map { collection ->
                    Collection(
                        collection.id,
                        collection.title,
                        collection.bodyHtml,
                        collection.image.src
                    )
                }
            }
    }
}