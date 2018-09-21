package com.tanzhiqiang.kmvvm.repository

import com.tanzhiqiang.kmvvm.mvvm.model.Weather
import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    /**
     * 获取天气信息
     */
    @GET("open/api/weather/json.shtml?city={city}")
    fun getWeather(@Path("city") city: String): Deferred<Weather>
}