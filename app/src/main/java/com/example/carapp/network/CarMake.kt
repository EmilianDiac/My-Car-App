package com.example.carapp.network

import com.squareup.moshi.Json

data class CarMake (
    @Json(name = "Make_ID") val makeId: Int,
    @Json(name = "Make_Name") val makeName: String
)