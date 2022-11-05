package ir.letscodingandroid.android_mvi_architecture_playground.repository.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import ir.letscodingandroid.android_mvi_architecture_playground.api.RetrofitBuilder
import ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState
import ir.letscodingandroid.android_mvi_architecture_playground.util.ApiEmptyResponse
import ir.letscodingandroid.android_mvi_architecture_playground.util.ApiErrorResponse
import ir.letscodingandroid.android_mvi_architecture_playground.util.ApiSuccessResponse
import ir.letscodingandroid.android_mvi_architecture_playground.util.DataState

object MainRepository {

    fun getBlogPosts(): LiveData<DataState<MainViewState>> {
        return Transformations
            .switchMap(RetrofitBuilder.apiService.getBlogPosts()) { apiResponse ->
                object: LiveData<DataState<MainViewState>>() {
                    override fun onActive() {
                        super.onActive()
                        value = when(apiResponse) {
                            is ApiSuccessResponse -> {
                                DataState.data(data = MainViewState(blogPosts = apiResponse.body))
                            }
                            is ApiErrorResponse -> {
                                DataState.data(data = MainViewState()) // Handle error?
                            }
                            is ApiEmptyResponse -> {
                                DataState.data(data = MainViewState()) // Handle empty/error?
                            }
                        }
                    }
                }
            }
        }

    fun getUser(userId: String): LiveData<DataState<MainViewState>> {
        return Transformations
            .switchMap(RetrofitBuilder.apiService.getUser(userId)) { apiResponse ->
                object: LiveData<DataState<MainViewState>>() {
                    override fun onActive() {
                        super.onActive()
                        when(apiResponse) {
                            is ApiSuccessResponse -> {
                                DataState.data(data = MainViewState(user = apiResponse.body))
                            }
                            is ApiErrorResponse -> {
                                DataState.data(data = MainViewState()) // Handle error?
                            }
                            is ApiEmptyResponse -> {
                                DataState.data(data = MainViewState()) // Handle empty/error?
                            }
                        }
                    }
                }
            }
    }
}