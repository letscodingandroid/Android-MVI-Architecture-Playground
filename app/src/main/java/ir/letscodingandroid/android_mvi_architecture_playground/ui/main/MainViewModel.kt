package ir.letscodingandroid.android_mvi_architecture_playground.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean
import ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean
import ir.letscodingandroid.android_mvi_architecture_playground.repository.main.MainRepository
import ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainStateEvent
import ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainStateEvent.*
import ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState
import ir.letscodingandroid.android_mvi_architecture_playground.util.AbsentLiveData
import ir.letscodingandroid.android_mvi_architecture_playground.util.DataState

class MainViewModel : ViewModel() {
    private val _stateEvent: MutableLiveData<MainStateEvent> = MutableLiveData()
    private val _viewState: MutableLiveData<MainViewState> = MutableLiveData()

    val viewState: LiveData<MainViewState>
        get() = _viewState

    val dataState: LiveData<DataState<MainViewState>> = Transformations
        .switchMap(_stateEvent) {
            handleMainStateEvent(it)
        }

    private fun handleMainStateEvent(mainStateEvent: MainStateEvent): LiveData<DataState<MainViewState>> {
        println("DEBUG: New StateEvent Detected: $mainStateEvent")
        return when (mainStateEvent) {
            is GetPostsEvent -> {
                MainRepository.getPosts()
            }
            is GetUserEvent -> {
                MainRepository.getUser(mainStateEvent.userId)
            }
            is None -> {
                AbsentLiveData.create()
            }
        }
    }

    fun setPostListData(blogPosts : List<PostBean>) {
        val update = getCurrentViewStateOrNew()
        update.posts = blogPosts
        _viewState.value = update
    }

    fun setUser(user : UserBean) {
        val update = getCurrentViewStateOrNew()
        update.user = user
        _viewState.value = update
    }

    private fun getCurrentViewStateOrNew(): MainViewState {
        return viewState.value ?: MainViewState()
    }

    fun setStateEvent(event : MainStateEvent) {
        _stateEvent.value = event
    }

}