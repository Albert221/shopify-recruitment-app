package wolszon.me.shopifydeveloperchallenge.injection

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import wolszon.me.shopifydeveloperchallenge.api.repository.CollectionsRepository
import wolszon.me.shopifydeveloperchallenge.api.repository.ProductsRepository
import wolszon.me.shopifydeveloperchallenge.api.repository.RetrofitCollectionsRepository
import wolszon.me.shopifydeveloperchallenge.api.repository.RetrofitProductsRepository

@Module
class RepositoriesModule {
    @Provides
    fun provideCollectionsRepository(retrofit: Retrofit): CollectionsRepository =
        RetrofitCollectionsRepository(retrofit)

    @Provides
    fun provideProductsRepository(retrofit: Retrofit): ProductsRepository =
        RetrofitProductsRepository(retrofit)
}