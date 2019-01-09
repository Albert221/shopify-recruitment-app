package wolszon.me.shopifydeveloperchallenge.api.mapper

interface Mapper<in T, out Y> {
    fun map(value: T): Y
}