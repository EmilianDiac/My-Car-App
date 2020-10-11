package com.example.carapp.network

import com.squareup.moshi.Json

data class CarMakesApiResultObject (
    @Json(name = "Count") val makeCount: Int,
    @Json(name = "Message") val resultMessage: String,
    @Json(name = "SearchCriteria") val searchCriteria: String?,
    @Json(name = "Results") val makes: List<CarMake>
)