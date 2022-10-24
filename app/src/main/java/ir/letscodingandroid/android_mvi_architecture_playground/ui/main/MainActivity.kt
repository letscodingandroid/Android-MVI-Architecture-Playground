package ir.letscodingandroid.android_mvi_architecture_playground.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.letscodingandroid.android_mvi_architecture_playground.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMainFragment()
    }

    private fun showMainFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, MainFragment(), "MainFragment")
            .commit()
    }
}