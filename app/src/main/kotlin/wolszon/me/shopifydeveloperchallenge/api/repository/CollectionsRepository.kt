package wolszon.me.shopifydeveloperchallenge.api.repository

import io.reactivex.Single
import wolszon.me.shopifydeveloperchallenge.api.model.Collection

interface CollectionsRepository {
    fun getCustomCollections(): Single<List<Collection>>
}