package wolszon.me.shopifydeveloperchallenge.android.ui.collection

import dagger.Module
import dagger.Provides

@Module
class CollectionModule {
    @Provides
    fun providePresenter(): CollectionPresenter = CollectionPresenter()
}