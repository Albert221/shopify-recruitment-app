package wolszon.me.shopifydeveloperchallenge.api.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Collection(
    val id: Long,
    val title: String,
    val body: String,
    val imageSrc: String
) : Parcelable