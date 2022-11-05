package ir.letscodingandroid.android_mvi_architecture_playground.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ir.letscodingandroid.android_mvi_architecture_playground.R
import ir.letscodingandroid.android_mvi_architecture_playground.ui.DataStateListener
import ir.letscodingandroid.android_mvi_architecture_playground.util.DataState
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , DataStateListener {

    private lateinit var mainViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        showMainFragment()
    }

    private fun showMainFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, MainFragment(), "MainFragment")
            .commit()
    }

    override fun onDataStateChange(dataState: DataState<*>?) {
        handleDataStateChange(dataState)
    }

    private fun handleDataStateChange(dataState: DataState<*>?){
        dataState?.let{
            // Handle loading
            showProgressBar(dataState.loading)

            // Handle Message
            dataState.message?.let{ message ->
                showToast(message)
            }
        }
    }

    private fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun showProgressBar(isVisible: Boolean){
        if(isVisible){
            progress_bar.visibility = View.VISIBLE
        }
        else{
            progress_bar.visibility = View.INVISIBLE
        }
    }
}