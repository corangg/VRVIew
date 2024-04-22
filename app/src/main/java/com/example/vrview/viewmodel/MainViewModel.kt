package com.example.vrview.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val openGallery : MutableLiveData<Boolean> = MutableLiveData(false)

    fun clickedOpenGallery(){
        openGallery.value = true
    }

}