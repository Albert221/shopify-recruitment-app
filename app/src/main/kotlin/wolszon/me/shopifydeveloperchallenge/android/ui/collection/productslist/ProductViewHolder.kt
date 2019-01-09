package wolszon.me.shopifydeveloperchallenge.android.ui.collection.productslist

import android.support.v7.widget.RecyclerView
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.products_list_item.*
import wolszon.me.shopifydeveloperchallenge.api.model.Product

class ProductViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun bindView(product: Product) {
        Picasso.get().load(product.imageSrc).into(productImage)
        productName.text = product.title
        quantity.text = "QUANTITY: ${product.inventoryQuantityAll}"
        variants.text = "Variants: ${product.variants.map { it.title }.joinToString(", ")}"
    }
}