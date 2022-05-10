package com.example.abcd1234.domain

import kotlinx.serialization.Serializable


@Serializable
data class TestModel(
    var coord: CoordModel,
    var weather: ArrayList<WeatherModel>,
    var base: String,
    var main: MainModel,
    var visibility: Int,
    var wind: WindModel,
    var clouds: CloudsModel,
    var dt: Int,
    var sys: SysModel,
    var timezone: Int,
    var id: Int,
    var name: String,
    var cod: Int,
)





