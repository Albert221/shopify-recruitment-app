package wolszon.me.shopifydeveloperchallenge.api.mapper

import wolszon.me.shopifydeveloperchallenge.api.model.Product
import wolszon.me.shopifydeveloperchallenge.api.model.Variant
import wolszon.me.shopifydeveloperchallenge.api.response.ProductsResponse

class ProductMapper {
    companion object : Mapper<ProductsResponse.Product, Product> {
        override fun map(value: ProductsResponse.Product): Product {
            return Product(
                id = value.id,
                title = value.title,
                imageSrc = value.image.src,
                variants = value.variants.map {
                    Variant(
                        id = it.id,
                        title = it.title,
                        price = it.price.toDoubleOrNull() ?: 0.0,
                        inventoryQuantity = it.inventoryQuantity
                    )
                })
        }
    }
}