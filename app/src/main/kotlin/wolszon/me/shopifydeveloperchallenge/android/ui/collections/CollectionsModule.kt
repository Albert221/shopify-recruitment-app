package wolszon.me.shopifydeveloperchallenge.android.ui.collections

import dagger.Module
import dagger.Provides

@Module
class CollectionsModule {
    @Provides
    fun providesPresenter() = CollectionsPresenter()
}