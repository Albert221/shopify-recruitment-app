package wolszon.me.shopifydeveloperchallenge.android.ui.collection

import wolszon.me.shopifydeveloperchallenge.api.model.Product
import wolszon.me.shopifydeveloperchallenge.base.BaseView

interface CollectionView : BaseView {
    fun showProducts(products: List<Product>)
}