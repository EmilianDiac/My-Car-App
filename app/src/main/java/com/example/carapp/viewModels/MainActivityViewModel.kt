package com.example.carapp.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    val buttonOneWasPressed: MutableLiveData<Boolean> = MutableLiveData(false)
    val buttonTwoWasPressed: MutableLiveData<Boolean> = MutableLiveData(false)

    fun onButtonOnePressed() {
        buttonOneWasPressed.value = true
    }

    fun onButtonTwoWasPressed() {
        buttonTwoWasPressed.value = true
    }
}