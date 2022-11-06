package ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state

import ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean
import ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean

data class MainViewState(
    var posts : List<PostBean>? = null,
    var user: UserBean? = null
)
