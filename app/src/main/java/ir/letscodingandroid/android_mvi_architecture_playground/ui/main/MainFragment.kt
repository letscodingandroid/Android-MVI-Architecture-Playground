package ir.letscodingandroid.android_mvi_architecture_playground.ui.main

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import ir.letscodingandroid.android_mvi_architecture_playground.R
import ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean
import ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean
import ir.letscodingandroid.android_mvi_architecture_playground.ui.DataStateListener
import ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainStateEvent
import ir.letscodingandroid.android_mvi_architecture_playground.util.TopSpacingItemDecoration
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() ,
    MainRecyclerAdapter.Interaction {

    private val TAG: String = "AppDebug"

    // its a reference to activity viewmodel
    private lateinit var mainVieModel : MainViewModel
    private lateinit var dataStateHandler: DataStateListener
    private lateinit var mainRecyclerAdapter: MainRecyclerAdapter

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

        initRecyclerView()
        subscribeObservers()
    }

    private fun initRecyclerView(){
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainFragment.context)
            addItemDecoration(TopSpacingItemDecoration(30))
            mainRecyclerAdapter = MainRecyclerAdapter(this@MainFragment)
            adapter = mainRecyclerAdapter
        }
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
            // Handle Loading and Error Message
            dataStateHandler.onDataStateChange(dataState)

            // Handle Data<T>
            dataState.data?.let { event ->
                event.getContentIfNotHandled()?.let { mainViewState ->
                    mainViewState.posts?.let {
                        mainVieModel.setPostListData(it)
                    }
                    mainViewState.user?.let {
                        mainVieModel.setUser(it)
                    }
                }
            }
        })

        mainVieModel.viewState.observe(viewLifecycleOwner, Observer { viewState ->
            println("DEBUG: ViewState: $viewState")
            viewState.posts?.let { posts ->
                // set posts to RecyclerView
                println("DEBUG: Setting blog posts to RecyclerView: $posts")
                mainRecyclerAdapter.submitList(posts)
            }
            viewState.user?.let { user ->
                // set User data to widgets
                println("DEBUG: Setting User data: $user")
                setUserProperties(user)
            }
        })
    }

    private fun setUserProperties(user: UserBean){
        email.text = user.email
        username.text = user.username

//        view?.let{
//            Glide.with(it.context)
//                .load(user.image)
//                .into(image)
//        }
    }

    override fun onItemSelected(position: Int, item: PostBean) {
        println("DEBUG: CLICKED ${position}")
        println("DEBUG: CLICKED ${item}")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try{
            dataStateHandler = context as DataStateListener
        }catch(e: ClassCastException){
            println("$context must implement DataStateListener")
        }
    }

}