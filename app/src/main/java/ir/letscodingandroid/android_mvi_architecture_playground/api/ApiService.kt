package ir.letscodingandroid.android_mvi_architecture_playground.api

import ir.letscodingandroid.android_mvi_architecture_playground.model.BlogPostBean
import ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("placeholder/blogs")
    fun getBlogPosts(): List<BlogPostBean>

    @GET("placeholder/user/{userId}")
    fun getUser(
        @Path("userId") userId: String
    ): UserBean
}