package ir.letscodingandroid.android_mvi_architecture_playground.ui.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BlogPostBean(
    @Expose
    @SerializedName("pk")
    val pk: Int? = null,

    @Expose
    @SerializedName("title")
    val title: String? = null,

    @Expose
    @SerializedName("body")
    val body: String? = null,

    @Expose
    @SerializedName("image")
    val image: String? = null
)