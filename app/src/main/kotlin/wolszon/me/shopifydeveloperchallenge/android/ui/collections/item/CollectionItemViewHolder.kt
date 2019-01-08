package wolszon.me.shopifydeveloperchallenge.android.ui.collections.item

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.collection_list_item.*
import wolszon.me.shopifydeveloperchallenge.api.model.Collection

class CollectionItemViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun bindView(collection: Collection) {
        name.text = collection.title

        container.setOnClickListener {
            Log.d("TEST", "klik!")
        }
    }
}