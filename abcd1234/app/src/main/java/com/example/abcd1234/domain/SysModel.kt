package com.example.abcd1234.domain

import kotlinx.serialization.Serializable

@Serializable
data class SysModel(var type: Int, var id: Int, var country: String, var sunrise: Long, var sunset: Long) {

}
