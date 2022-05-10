package com.example.abcd1234.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.abcd1234.domain.TestModel
import com.example.abcd1234.data.WeatherRemoteDataSourceOkHttp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ActivityViewModel : ViewModel() {

    private val weatherRemoteDataSourceOkHttp: WeatherRemoteDataSourceOkHttp =
        WeatherRemoteDataSourceOkHttp()

    private val _state = MutableStateFlow<TestModel?>(null)
    val state: StateFlow<TestModel?> = _state

    fun loadData() {
        viewModelScope.launch(Dispatchers.IO) {
            Log.i("test", "!")

            try {
                Log.i("test", weatherRemoteDataSourceOkHttp.getData().toString())
            } catch(e: Exception) {
                Log.i("test", e.toString())
            }
            _state.emit(weatherRemoteDataSourceOkHttp.getData())
        }
    }
}