package wolszon.me.shopifydeveloperchallenge.android.ui.collection

import dagger.Module
import dagger.Provides
import wolszon.me.shopifydeveloperchallenge.api.repository.ProductsRepository
import wolszon.me.shopifydeveloperchallenge.base.Schedulers

@Module
class CollectionModule {
    @Provides
    fun providePresenter(schedulers: Schedulers, productsRepository: ProductsRepository): CollectionPresenter =
        CollectionPresenter(schedulers, productsRepository)
}