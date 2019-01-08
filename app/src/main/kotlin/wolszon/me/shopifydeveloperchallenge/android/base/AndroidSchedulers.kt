package wolszon.me.shopifydeveloperchallenge.android.base

import io.reactivex.Scheduler
import wolszon.me.shopifydeveloperchallenge.base.Schedulers

class AndroidSchedulers : Schedulers {
    override fun mainThread(): Scheduler {
        return io.reactivex.schedulers.Schedulers.io()
    }

    override fun backgroundThread(): Scheduler {
        return io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
    }
}