package ir.letscodingandroid.android_mvi_architecture_playground.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import ir.letscodingandroid.android_mvi_architecture_playground.model.BlogPostBean
import ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean
import ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainStateEvent
import ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainStateEvent.*
import ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState
import ir.letscodingandroid.android_mvi_architecture_playground.util.AbsentLiveData

class MainViewModel : ViewModel() {
    private val _stateEvent: MutableLiveData<MainStateEvent> = MutableLiveData()
    private val _viewState: MutableLiveData<MainViewState> = MutableLiveData()

    val viewState: LiveData<MainViewState>
        get() = _viewState

    val dataState: LiveData<MainViewState> = Transformations
        .switchMap(_stateEvent) {
            handleMainStateEvent(it)
        }

    private fun handleMainStateEvent(mainStateEvent: MainStateEvent): LiveData<MainViewState> {
        return when (mainStateEvent) {
            is GetBlogPostsEvent -> {
                AbsentLiveData.create()
            }
            is GetUserEvent -> {
                AbsentLiveData.create()
            }
            is None -> {
                AbsentLiveData.create()
            }
        }
    }

    fun setBlogListData(blogPosts : List<BlogPostBean>) {
        val update = getCurrentViewStateOrNew()
        update.blogPosts = blogPosts
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