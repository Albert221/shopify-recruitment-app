package wolszon.me.shopifydeveloperchallenge.android.ui

import android.content.Context
import wolszon.me.shopifydeveloperchallenge.android.ui.collection.CollectionActivity
import wolszon.me.shopifydeveloperchallenge.api.model.Collection

class Navigator(private val context: Context) {
    fun openCollectionActivity(collection: Collection) {
        context.startActivity(CollectionActivity.createIntent(context, collection))
    }
}