package ir.letscodingandroid.android_mvi_architecture_playground.ui.main

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ir.letscodingandroid.android_mvi_architecture_playground.R
import ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainStateEvent

class MainFragment : Fragment() {

    // its a reference to activity viewmodel
    private lateinit var mainVieModel : MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container , false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)

        mainVieModel = activity?.run {
            ViewModelProvider(this).get(MainViewModel::class.java)
        }?: throw Exception("Invalid activity")

        subscribeObservers()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_get_blogs -> { triggerGetBlogsEvent() }
            R.id.action_get_user -> { triggerGetUserEvent() }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun triggerGetUserEvent() {
        mainVieModel.setStateEvent(MainStateEvent.GetUserEvent("1"))
    }

    private fun triggerGetBlogsEvent() {
        mainVieModel.setStateEvent(MainStateEvent.GetPostsEvent())
    }

    private fun subscribeObservers() {
        mainVieModel.dataState.observe(viewLifecycleOwner, Observer { dataState ->

            println("DEBUG: DataState: $dataState")

            // Handle Data<T>
            dataState.data?.let { mainViewState ->
                mainViewState.posts?.let {
                    mainVieModel.setPostListData(it)
                }

                mainViewState.user?.let {
                    mainVieModel.setUser(it)
                }
            }

            // Handle Error
            dataState.message?.let {

            }

            // Handle loading
            dataState.loading.let {

            }

        })

        mainVieModel.viewState.observe(viewLifecycleOwner, Observer { viewState ->

            println("DEBUG: ViewState: $viewState")
            viewState.posts?.let {

            }

            viewState.user?.let {

            }
        })
    }
}