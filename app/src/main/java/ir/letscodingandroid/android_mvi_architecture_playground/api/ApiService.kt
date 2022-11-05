package ir.letscodingandroid.android_mvi_architecture_playground.api

import androidx.lifecycle.LiveData
import ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean
import ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean
import ir.letscodingandroid.android_mvi_architecture_playground.util.GenericApiResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("posts")
    fun getPosts(): LiveData<GenericApiResponse<List<PostBean>>>

    @GET("/users/{userId}")
    fun getUser(
        @Path("userId") userId: String
    ): LiveData<GenericApiResponse<UserBean>>
}