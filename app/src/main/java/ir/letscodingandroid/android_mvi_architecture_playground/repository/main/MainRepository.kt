package ir.letscodingandroid.android_mvi_architecture_playground.repository.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import ir.letscodingandroid.android_mvi_architecture_playground.api.RetrofitBuilder
import ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState
import ir.letscodingandroid.android_mvi_architecture_playground.util.ApiEmptyResponse
import ir.letscodingandroid.android_mvi_architecture_playground.util.ApiErrorResponse
import ir.letscodingandroid.android_mvi_architecture_playground.util.ApiSuccessResponse

object MainRepository {

    fun getBlogPosts(): LiveData<MainViewState> {
        return Transformations
            .switchMap(RetrofitBuilder.apiService.getBlogPosts()) { apiResponse ->
                object: LiveData<MainViewState>() {
                    override fun onActive() {
                        super.onActive()
                        when(apiResponse) {
                            is ApiSuccessResponse -> {
                                value = MainViewState(blogPosts = apiResponse.body)
                            }
                            is ApiErrorResponse -> {
                                value = MainViewState() // Handle error?
                            }
                            is ApiEmptyResponse -> {
                                value = MainViewState() // Handle empty/error?
                            }
                        }
                    }
                }
            }
        }

    fun getUser(userId: String): LiveData<MainViewState> {
        return Transformations
            .switchMap(RetrofitBuilder.apiService.getUser(userId)) { apiResponse ->
                object: LiveData<MainViewState>() {
                    override fun onActive() {
                        super.onActive()
                        when(apiResponse) {
                            is ApiSuccessResponse -> {
                                value = MainViewState(user = apiResponse.body)
                            }
                            is ApiErrorResponse -> {
                                value = MainViewState() // Handle error?
                            }
                            is ApiEmptyResponse -> {
                                value = MainViewState() // Handle empty/error?
                            }
                        }
                    }
                }
            }
    }
}