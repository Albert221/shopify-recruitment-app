package wolszon.me.shopifydeveloperchallenge.android.ui.collection

import wolszon.me.shopifydeveloperchallenge.api.repository.ProductsRepository
import wolszon.me.shopifydeveloperchallenge.base.BasePresenter
import wolszon.me.shopifydeveloperchallenge.base.Schedulers

class CollectionPresenter(private val schedulers: Schedulers, private val productsRepository: ProductsRepository) :
    BasePresenter<CollectionView>() {
    fun loadProducts(collectionId: Long) {
        compositeObservable.add(
            productsRepository
                .getProductsInCollection(collectionId)
                .subscribeOn(schedulers.backgroundThread())
                .observeOn(schedulers.mainThread())
                .subscribe({ view?.showProducts(it) }, { it.printStackTrace() })
        )
    }
}