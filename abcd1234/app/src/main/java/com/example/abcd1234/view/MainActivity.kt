package com.example.abcd1234.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.abcd1234.presentation.ActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binder: MainActivityBinder
    private lateinit var viewModel: ActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binder = MainActivityBinder(this)
        binder.bindView()

        viewModel = ViewModelProvider(this)[ActivityViewModel::class.java]

        viewModel.loadData()

        lifecycleScope.launchWhenStarted {
            viewModel.state.collect {
                if (it != null) {
                    binder.onDataLoaded(it)
                }
            }
        }
    }

}