package ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state

sealed class MainStateEvent {
    class GetBlogPostsEvent: MainStateEvent()
    class GetUserEvent(val userId: String): MainStateEvent()
    class None: MainStateEvent()
}
