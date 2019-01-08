package wolszon.me.shopifydeveloperchallenge.android.ui.collections

import wolszon.me.shopifydeveloperchallenge.api.model.Collection
import wolszon.me.shopifydeveloperchallenge.base.BaseView

interface CollectionsView : BaseView {
    fun showCollections(collections: List<Collection>)
}