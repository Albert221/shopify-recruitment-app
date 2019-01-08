package wolszon.me.shopifydeveloperchallenge.injection

import android.content.Context
import dagger.Binds
import dagger.Module
import wolszon.me.shopifydeveloperchallenge.android.Application

@Module
abstract class AppModule {
    @Binds
    abstract fun provideContext(application: Application): Context
}