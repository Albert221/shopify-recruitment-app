package wolszon.me.shopifydeveloperchallenge.api.response

import com.squareup.moshi.Json

data class CollectsResponse(
    @Json(name = "collects")
    var collects: List<Collect>
) {
    data class Collect(
        @Json(name = "id")
        var id: Long,
        @Json(name = "collection_id")
        var collectionId: Long,
        @Json(name = "product_id")
        var productId: Long,
        @Json(name = "featured")
        var featured: Boolean,
        @Json(name = "created_at")
        var createdAt: String,
        @Json(name = "updated_at")
        var updatedAt: String,
        @Json(name = "position")
        var position: Int,
        @Json(name = "sort_value")
        var sortValue: String
    )
}