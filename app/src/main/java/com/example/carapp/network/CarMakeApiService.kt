package com.example.carapp.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

    private const val BASE_URL = "https://vpic.nhtsa.dot.gov"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface CarMakeApiService {
    @GET("api/vehicles/getallmakes?format=json")
    suspend fun getCarMakes(): CarMakesApiResultObject
}

object CarMakesApi {
    val retrofitService: CarMakeApiService by lazy {
        retrofit.create(CarMakeApiService::class.java)
    }
}