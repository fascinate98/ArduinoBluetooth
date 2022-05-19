package com.lilly.bluetoothclassic

import com.google.gson.JsonObject

import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {

    @Headers("accept: application/json",
        "content-type: application/json")
    @POST("/api/arduino")
    fun requestLogin(
        @Body json: JsonObject
    ) : Call<ResponseData>


}