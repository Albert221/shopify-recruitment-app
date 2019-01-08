package wolszon.me.shopifydeveloperchallenge.injection

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import wolszon.me.shopifydeveloperchallenge.api.repository.CollectionsRepository
import wolszon.me.shopifydeveloperchallenge.api.repository.RetrofitCollectionsRepository

@Module
class RepositoriesModule {
    @Provides
    fun providesCollectionsRepository(retrofit: Retrofit): CollectionsRepository =
        RetrofitCollectionsRepository(retrofit)
}