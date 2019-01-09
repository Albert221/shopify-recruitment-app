package wolszon.me.shopifydeveloperchallenge.api.model

data class Product(
    val id: Long,
    val title: String,
    val imageSrc: String,
    val variants: List<Variant>
) {
    val inventoryQuantityAll: Int
        get() = variants.fold(0) { quantity, variant -> quantity + variant.inventoryQuantity }
}