package com.example.abcd1234.domain

import kotlinx.serialization.Serializable

@Serializable
data class WeatherModel(var id: Int, var main: String, var description: String, var icon: String) {

}
