package com.lilly.bluetoothclassic
import java.io.Serializable
import com.google.gson.annotations.SerializedName
import lombok.Data

@Data
data class Arduino (
    @SerializedName("arduinoTemp")
    var arduinoTemp: String,
    @SerializedName("arduinoHumid")
    var arduinoHumid: String,
    @SerializedName("arduinoDist")
    var arduinoDist: String
): Serializable