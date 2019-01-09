package wolszon.me.shopifydeveloperchallenge.android.ui.collections.list

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import wolszon.me.shopifydeveloperchallenge.R
import wolszon.me.shopifydeveloperchallenge.android.utils.inflate
import wolszon.me.shopifydeveloperchallenge.api.model.Collection
import javax.inject.Inject

class CollectionsListAdapter @Inject constructor() : RecyclerView.Adapter<CollectionViewHolder>() {
    private var collections = listOf<Collection>()
    var onItemClick: ((Collection) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        return CollectionViewHolder(parent.inflate(R.layout.collections_list_item))
    }

    override fun getItemCount(): Int = collections.size

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.apply {
            bindView(collections[position]) {
                if (onItemClick != null)
                    onItemClick!!(collections[position])
            }
        }
    }

    fun showCollections(collections: List<Collection>) {
        this.collections = collections
        notifyDataSetChanged()
    }
}