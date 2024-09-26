package com.example.databinding_ny

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var name = MutableLiveData("Uzair")

    fun clear(){
        name.value = ""
    }
}