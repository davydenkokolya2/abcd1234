package com.example.abcd1234.domain

import kotlinx.serialization.Serializable

@Serializable
data class MainModel(
    var temp: Float,
    var feels_like: Float,
    var temp_min: Float,
    var temp_max: Float,
    var pressure: Int,
    var humidity: Int,
    var sea_level: Int,
    var grnd_level: Int
)
