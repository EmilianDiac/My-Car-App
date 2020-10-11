package com.example.carapp.viewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.carapp.network.CarMake
import com.example.carapp.network.CarMakesApi
import kotlinx.coroutines.launch

class CarsFragmentViewModel: ViewModel() {

    val carMakeList = MutableLiveData<List<CarMake>>()

    init {
        getAllMakes()
    }


    fun getAllMakes() {
        val TAG = "CarsFragmentViewModel"
        viewModelScope.launch{
            try {
                carMakeList.value = CarMakesApi.retrofitService.getCarMakes().makes
                Log.d(TAG, carMakeList.toString())
            } catch (e: Exception) {
                Log.d(TAG, "Failure: ${e.message}")
            }
        }
    }
}