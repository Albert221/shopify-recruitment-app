package wolszon.me.shopifydeveloperchallenge.android.ui.collections

import wolszon.me.shopifydeveloperchallenge.api.repository.CollectionsRepository
import wolszon.me.shopifydeveloperchallenge.base.BasePresenter
import wolszon.me.shopifydeveloperchallenge.base.Schedulers

class CollectionsPresenter(
    private val schedulers: Schedulers,
    private val collectionsRepository: CollectionsRepository
) : BasePresenter<CollectionsView>() {
    fun loadCollections() {
        compositeObservable.add(
            collectionsRepository.getCustomCollections()
                .subscribeOn(schedulers.backgroundThread())
                .observeOn(schedulers.mainThread())
                .subscribe({ view?.showCollections(it) }, { it.printStackTrace() })
        )
    }
}