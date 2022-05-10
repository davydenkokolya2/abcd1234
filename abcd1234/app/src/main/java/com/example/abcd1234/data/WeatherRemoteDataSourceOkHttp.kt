package com.example.abcd1234.data

import com.example.abcd1234.domain.TestModel
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class WeatherRemoteDataSourceOkHttp {

    private val client = OkHttpClient()

    fun getData(): TestModel {
        val request = Request.Builder()
            .url("https://community-open-weather-map.p.rapidapi.com/weather?q=Minsk&id=2172797&lang=ru&units=metric")
            .get()
            .addHeader("X-RapidAPI-Host", "community-open-weather-map.p.rapidapi.com")
            .addHeader("X-RapidAPI-Key", "03cd199c38mshc58afbc571a5213p19ec6djsnf729916bd6f7")
            .build()

        val response: Response = client.newCall(request).execute()

        response.body?.byteStream()?.use {
            return Json.decodeFromStream(it)
        }

        throw IllegalStateException("nothing returned in body")
    }
}



