package wolszon.me.shopifydeveloperchallenge.api.response

import com.squareup.moshi.Json

data class CustomCollectionsResponse(
    @Json(name = "custom_collections")
    var customCollections: List<CustomCollection>
) {
    data class CustomCollection(
        @Json(name = "id")
        var id: Long,
        @Json(name = "handle")
        var handle: String,
        @Json(name = "title")
        var title: String,
        @Json(name = "updated_at")
        var updatedAt: String,
        @Json(name = "body_html")
        var bodyHtml: String,
        @Json(name = "published_at")
        var publishedAt: String,
        @Json(name = "sort_order")
        var sortOrder: String,
        @Json(name = "template_suffix")
        var templateSuffix: String,
        @Json(name = "published_scope")
        var publishedScope: String,
        @Json(name = "admin_graphql_api_id")
        var adminGraphqlApiId: String,
        @Json(name = "image")
        var image: Image
    )

    data class Image(
        @Json(name = "created_at")
        var createdAt: String,
        @Json(name = "alt")
        var alt: String?,
        @Json(name = "width")
        var width: Int,
        @Json(name = "height")
        var height: Int,
        @Json(name = "src")
        var src: String
    )
}