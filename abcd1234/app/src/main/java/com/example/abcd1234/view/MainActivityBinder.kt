package com.example.abcd1234.view

import android.app.Activity
import android.view.LayoutInflater
import com.example.abcd1234.domain.TestModel
import com.example.abcd1234.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivityBinder(val activity: Activity) {
    lateinit var binding: ActivityMainBinding

    fun bindView() {
        binding = ActivityMainBinding.inflate(LayoutInflater.from(activity))
        activity.setContentView(binding.root)
    }

    fun onDataLoaded(testModel: TestModel) {
        binding.degrees.text = testModel.main.temp.roundToInt().toString() + "°"
        binding.textView.text = (testModel.wind.speed * 3.6).roundToInt().toString() + "km/h"
        binding.textView2.text = testModel.main.humidity.toString() + "%"
        binding.textView3.text = "34%"
        binding.textView5.text = testModel.weather[0].main
    }
}