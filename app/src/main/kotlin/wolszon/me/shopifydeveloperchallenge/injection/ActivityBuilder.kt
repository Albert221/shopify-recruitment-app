package wolszon.me.shopifydeveloperchallenge.injection

import dagger.Module
import dagger.android.ContributesAndroidInjector
import wolszon.me.shopifydeveloperchallenge.android.ui.collections.CollectionsActivity
import wolszon.me.shopifydeveloperchallenge.android.ui.collections.CollectionsModule

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [CollectionsModule::class])
    abstract fun bindCollectionsActivity(): CollectionsActivity
}