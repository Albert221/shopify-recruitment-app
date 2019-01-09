package wolszon.me.shopifydeveloperchallenge.api.repository

import io.reactivex.Single
import retrofit2.Retrofit
import wolszon.me.shopifydeveloperchallenge.api.mapper.CollectionMapper
import wolszon.me.shopifydeveloperchallenge.api.model.Collection

class RetrofitCollectionsRepository(private val retrofit: Retrofit) : CollectionsRepository {
    private val retrofitApi: RetrofitApi by lazy { retrofit.create(RetrofitApi::class.java) }

    override fun getCustomCollections(): Single<List<Collection>> {
        return retrofitApi
            .getCustomCollections()
            .map { it.customCollections }
            .map { collections -> collections.map { CollectionMapper.map(it) } }
    }
}