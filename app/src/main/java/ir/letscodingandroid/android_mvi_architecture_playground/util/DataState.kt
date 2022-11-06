package ir.letscodingandroid.android_mvi_architecture_playground.util

data class DataState<T>(
    var message: Event<String>? = null,
    var loading: Boolean = false,
    var data: Event<T>? = null
) {
    companion object {
        fun <T> error(
            message: String
        ): DataState<T> {
            return DataState(
                message = Event(message)
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
                message = Event.messageEvent(message),
                data = Event.dataEvent(data)
            )
        }
    }

}