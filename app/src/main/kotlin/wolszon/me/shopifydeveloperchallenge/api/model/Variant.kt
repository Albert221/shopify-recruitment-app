package wolszon.me.shopifydeveloperchallenge.api.model

data class Variant(
    val id: Long,
    val title: String,
    val inventoryQuantity: Int,
    val price: Double
)