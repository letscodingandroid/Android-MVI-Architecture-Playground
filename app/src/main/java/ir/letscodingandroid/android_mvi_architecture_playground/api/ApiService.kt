package ir.letscodingandroid.android_mvi_architecture_playground.api

import androidx.lifecycle.LiveData
import com.codingwithmitch.mviexample.util.GenericApiResponse
import ir.letscodingandroid.android_mvi_architecture_playground.model.BlogPostBean
import ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("placeholder/blogs")
    fun getBlogPosts(): LiveData<GenericApiResponse<List<BlogPostBean>>>

    @GET("placeholder/user/{userId}")
    fun getUser(
        @Path("userId") userId: String
    ): LiveData<GenericApiResponse<UserBean>>
}