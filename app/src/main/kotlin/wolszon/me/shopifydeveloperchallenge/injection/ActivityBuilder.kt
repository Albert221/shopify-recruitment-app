package wolszon.me.shopifydeveloperchallenge.injection

import dagger.Module
import dagger.android.ContributesAndroidInjector
import wolszon.me.shopifydeveloperchallenge.android.ui.collection.CollectionActivity
import wolszon.me.shopifydeveloperchallenge.android.ui.collection.CollectionModule
import wolszon.me.shopifydeveloperchallenge.android.ui.collections.CollectionsActivity
import wolszon.me.shopifydeveloperchallenge.android.ui.collections.CollectionsModule

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [CollectionsModule::class])
    abstract fun bindCollectionsActivity(): CollectionsActivity

    @ContributesAndroidInjector(modules = [CollectionModule::class])
    abstract fun bindCollectionActivity(): CollectionActivity
}