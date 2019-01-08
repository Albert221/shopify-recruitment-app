package wolszon.me.shopifydeveloperchallenge.android

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import wolszon.me.shopifydeveloperchallenge.injection.DaggerAppComponent

class Application : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}