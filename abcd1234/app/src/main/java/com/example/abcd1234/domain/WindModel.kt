package com.example.abcd1234.domain

import kotlinx.serialization.Serializable

@Serializable
data class WindModel(var speed: Float, var deg: Int, var gust: Float) {

}
