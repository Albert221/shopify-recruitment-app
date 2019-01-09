package wolszon.me.shopifydeveloperchallenge.android.ui.collection.productslist

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import wolszon.me.shopifydeveloperchallenge.R
import wolszon.me.shopifydeveloperchallenge.android.utils.inflate
import wolszon.me.shopifydeveloperchallenge.api.model.Product
import javax.inject.Inject

class ProductsListAdapter @Inject constructor() : RecyclerView.Adapter<ProductViewHolder>() {
    private var products = listOf<Product>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(parent.inflate(R.layout.products_list_item))
    }

    override fun getItemCount(): Int = products.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.apply {
            bindView(products[position])
        }
    }

    fun showProducts(products: List<Product>) {
        this.products = products
        notifyDataSetChanged()
    }
}