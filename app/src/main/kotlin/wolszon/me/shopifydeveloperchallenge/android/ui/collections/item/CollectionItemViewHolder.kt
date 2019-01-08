package wolszon.me.shopifydeveloperchallenge.android.ui.collections.item

import android.support.v7.widget.RecyclerView
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.collection_list_item.*
import wolszon.me.shopifydeveloperchallenge.api.model.Collection

class CollectionItemViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer {
    fun bindView(collection: Collection, onClick: () -> Unit) {
        name.text = collection.title
        Picasso.get().load(collection.imageSrc).into(thumbnail)
        container.setOnClickListener { onClick() }
    }
}