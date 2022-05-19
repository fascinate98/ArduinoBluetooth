package com.lilly.bluetoothclassic

import com.google.gson.annotations.SerializedName
import lombok.Data


@Data
data class ResponseData (
    @SerializedName("result")
    var result: String,
    @SerializedName("data")
    var data: String
)