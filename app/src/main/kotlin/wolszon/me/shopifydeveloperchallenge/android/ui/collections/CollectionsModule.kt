package wolszon.me.shopifydeveloperchallenge.android.ui.collections

import dagger.Module
import dagger.Provides
import wolszon.me.shopifydeveloperchallenge.api.repository.CollectionsRepository
import wolszon.me.shopifydeveloperchallenge.base.Schedulers

@Module
class CollectionsModule {
    @Provides
    fun providesPresenter(schedulers: Schedulers, collectionsRepository: CollectionsRepository) =
        CollectionsPresenter(schedulers, collectionsRepository)
}