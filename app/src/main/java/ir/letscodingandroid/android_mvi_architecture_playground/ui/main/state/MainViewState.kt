package ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state

import ir.letscodingandroid.android_mvi_architecture_playground.ui.model.BlogPostBean
import ir.letscodingandroid.android_mvi_architecture_playground.ui.model.UserBean

data class MainViewState(
    var blogPosts : List<BlogPostBean>? = null,
    var user: UserBean? = null
)
