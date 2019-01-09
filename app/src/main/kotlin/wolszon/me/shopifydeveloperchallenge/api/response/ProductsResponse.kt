package wolszon.me.shopifydeveloperchallenge.api.response

import com.squareup.moshi.Json

data class ProductsResponse(
    @Json(name = "products")
    var products: List<Product>
) {
    data class Product(
        @Json(name = "id")
        var id: Long,
        @Json(name = "title")
        var title: String,
        @Json(name = "body_html")
        var bodyHtml: String,
        @Json(name = "vendor")
        var vendor: String,
        @Json(name = "product_type")
        var productType: String,
        @Json(name = "created_at")
        var createdAt: String,
        @Json(name = "handle")
        var handle: String,
        @Json(name = "updated_at")
        var updatedAt: String,
        @Json(name = "published_at")
        var publishedAt: String,
        @Json(name = "template_suffix")
        var templateSuffix: String?,
        @Json(name = "tags")
        var tags: String,
        @Json(name = "published_scope")
        var publishedScope: String,
        @Json(name = "admin_graphql_api_id")
        var adminGraphqlApiId: String,
        @Json(name = "variants")
        var variants: List<Variant>,
        @Json(name = "options")
        var options: List<Option>,
        @Json(name = "images")
        var images: List<Image>,
        @Json(name = "image")
        var image: Image
    )

    data class Variant(
        @Json(name = "id")
        var id: Long,
        @Json(name = "product_id")
        var productId: Long,
        @Json(name = "title")
        var title: String,
        @Json(name = "price")
        var price: String,
        @Json(name = "sku")
        var sku: String,
        @Json(name = "position")
        var position: Int,
        @Json(name = "inventory_policy")
        var inventoryPolicy: String,
        @Json(name = "compare_at_price")
        var compareAtPrice: String?,
        @Json(name = "fulfillment_service")
        var fulfillmentService: String,
        @Json(name = "inventory_management")
        var inventoryManagement: String?,
        @Json(name = "option1")
        var option1: String,
        @Json(name = "option2")
        var option2: String?,
        @Json(name = "option3")
        var option3: String?,
        @Json(name = "created_at")
        var createdAt: String,
        @Json(name = "updated_at")
        var updatedAt: String,
        @Json(name = "taxable")
        var taxable: Boolean,
        @Json(name = "barcode")
        var barcode: String?,
        @Json(name = "grams")
        var grams: Int,
        @Json(name = "image_id")
        var imageId: Long?,
        @Json(name = "weight")
        var weight: Double,
        @Json(name = "weight_unit")
        var weightUnit: String,
        @Json(name = "inventory_item_id")
        var inventoryItemId: Long,
        @Json(name = "inventory_quantity")
        var inventoryQuantity: Int,
        @Json(name = "old_inventory_quantity")
        var oldInventoryQuantity: Int,
        @Json(name = "requires_shipping")
        var requiresShipping: Boolean,
        @Json(name = "admin_graphql_api_id")
        var adminGraphqlApiId: String
    )

    data class Option(
        @Json(name = "id")
        var id: Long,
        @Json(name = "product_id")
        var productId: Long,
        @Json(name = "name")
        var name: String,
        @Json(name = "position")
        var position: Int,
        @Json(name = "values")
        var values: List<String>
    )

    data class Image(
        @Json(name = "id")
        var id: Long,
        @Json(name = "product_id")
        var productId: Long,
        @Json(name = "position")
        var position: Int,
        @Json(name = "created_at")
        var createdAt: String,
        @Json(name = "updated_at")
        var updatedAt: String,
        @Json(name = "alt")
        var alt: String?,
        @Json(name = "width")
        var width: Int,
        @Json(name = "height")
        var height: Int,
        @Json(name = "src")
        var src: String,
        @Json(name = "variant_ids")
        var variantIds: List<Long>,
        @Json(name = "admin_graphql_api_id")
        var adminGraphqlApiId: String
    )
}