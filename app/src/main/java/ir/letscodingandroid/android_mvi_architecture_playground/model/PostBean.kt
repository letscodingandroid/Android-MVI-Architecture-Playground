package ir.letscodingandroid.android_mvi_architecture_playground.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PostBean(
    @Expose
    @SerializedName("id")
    val id: Int? = null,

    @Expose
    @SerializedName("title")
    val title: String? = null,

    @Expose
    @SerializedName("body")
    val body: String? = null
)