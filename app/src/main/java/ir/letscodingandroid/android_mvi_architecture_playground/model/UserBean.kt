package ir.letscodingandroid.android_mvi_architecture_playground.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserBean(
    @Expose
    @SerializedName("email")
    val email: String? = null,

    @Expose
    @SerializedName("username")
    val username: String? = null,

    @Expose
    @SerializedName("image")
    val image: String? = null
)