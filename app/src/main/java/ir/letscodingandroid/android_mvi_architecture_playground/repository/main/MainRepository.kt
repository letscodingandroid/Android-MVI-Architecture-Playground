package ir.letscodingandroid.android_mvi_architecture_playground.repository.main

import androidx.lifecycle.LiveData
import ir.letscodingandroid.android_mvi_architecture_playground.api.RetrofitBuilder
import ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean
import ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean
import ir.letscodingandroid.android_mvi_architecture_playground.repository.NetworkBoundResource
import ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState
import ir.letscodingandroid.android_mvi_architecture_playground.util.ApiSuccessResponse
import ir.letscodingandroid.android_mvi_architecture_playground.util.DataState
import ir.letscodingandroid.android_mvi_architecture_playground.util.GenericApiResponse

object MainRepository {

    fun getPosts(): LiveData<DataState<MainViewState>> {
        return object: NetworkBoundResource<List<PostBean>, MainViewState>(){

            override fun handleApiSuccessResponse(response: ApiSuccessResponse<List<PostBean>>) {
                result.value = DataState.data(
                    null,
                    MainViewState(
                        posts = response.body,
                        user = null
                    )
                )
            }

            override fun createCall(): LiveData<GenericApiResponse<List<PostBean>>> {
                return RetrofitBuilder.apiService.getPosts()
            }

        }.asLiveData()
    }

    fun getUser(userId: String): LiveData<DataState<MainViewState>> {
        return object: NetworkBoundResource<UserBean, MainViewState>(){

            override fun handleApiSuccessResponse(response: ApiSuccessResponse<UserBean>) {
                result.value = DataState.data(
                    null,
                    MainViewState(
                        posts = null,
                        user = response.body
                    )
                )
            }

            override fun createCall(): LiveData<GenericApiResponse<UserBean>> {
                return RetrofitBuilder.apiService.getUser(userId)
            }

        }.asLiveData()
    }
}