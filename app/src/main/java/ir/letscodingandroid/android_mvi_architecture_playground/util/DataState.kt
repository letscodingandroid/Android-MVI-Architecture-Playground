package ir.letscodingandroid.android_mvi_architecture_playground.util

data class DataState<T>(
    var message: String? = null,
    var loading: Boolean = false,
    var data: T? = null
) {
    companion object {
        fun <T> error(
            message: String
        ): DataState<T> {
            return DataState(
                message = message
            )
        }

        fun <T> loading(
            isLoading: Boolean
        ): DataState<T> {
            return DataState(
                loading = isLoading
            )
        }

        fun <T> data(
            message: String? = null,
            data: T? = null
        ): DataState<T> {
            return DataState(
                message = message,
                data = data
            )
        }
    }

}