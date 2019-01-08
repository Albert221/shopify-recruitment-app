package wolszon.me.shopifydeveloperchallenge.android.ui.collections.item

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import wolszon.me.shopifydeveloperchallenge.R
import wolszon.me.shopifydeveloperchallenge.android.utils.inflate
import wolszon.me.shopifydeveloperchallenge.api.model.Collection
import javax.inject.Inject

class CollectionsListAdapter @Inject constructor() : RecyclerView.Adapter<CollectionItemViewHolder>() {
    var collections = listOf<Collection>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionItemViewHolder {
        return CollectionItemViewHolder(parent.inflate(R.layout.collection_list_item))
    }

    override fun getItemCount(): Int = collections.size

    override fun onBindViewHolder(holder: CollectionItemViewHolder, position: Int) {
        holder.apply {
            bindView(collections[position])
        }
    }

    fun showCollections(collections: List<Collection>) {
        this.collections = collections
        notifyDataSetChanged()
    }
}