package wolszon.me.shopifydeveloperchallenge.android.ui.collections

import dagger.Module
import dagger.Provides
import wolszon.me.shopifydeveloperchallenge.android.ui.Navigator
import wolszon.me.shopifydeveloperchallenge.android.ui.collection.CollectionActivity
import wolszon.me.shopifydeveloperchallenge.api.repository.CollectionsRepository
import wolszon.me.shopifydeveloperchallenge.base.Schedulers

@Module
class CollectionsModule {
    @Provides
    fun provideNavigator(collectionsActivity: CollectionsActivity): Navigator = Navigator(collectionsActivity)

    @Provides
    fun providesPresenter(navigator: Navigator, schedulers: Schedulers, collectionsRepository: CollectionsRepository) =
        CollectionsPresenter(navigator, schedulers, collectionsRepository)
}