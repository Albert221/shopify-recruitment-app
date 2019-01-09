package wolszon.me.shopifydeveloperchallenge.api.mapper

import wolszon.me.shopifydeveloperchallenge.api.model.Collection
import wolszon.me.shopifydeveloperchallenge.api.response.CustomCollectionsResponse

class CollectionMapper {
    companion object : Mapper<CustomCollectionsResponse.CustomCollection, Collection> {
        override fun map(value: CustomCollectionsResponse.CustomCollection): Collection {
            return Collection(id = value.id, title = value.title, body = value.bodyHtml, imageSrc = value.image.src)
        }
    }
}