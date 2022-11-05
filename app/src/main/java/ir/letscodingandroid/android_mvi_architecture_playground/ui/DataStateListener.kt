package ir.letscodingandroid.android_mvi_architecture_playground.ui

import ir.letscodingandroid.android_mvi_architecture_playground.util.DataState

interface DataStateListener {
    fun onDataStateChange(dataState: DataState<*>?)
}