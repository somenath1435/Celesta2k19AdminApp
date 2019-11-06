package com.example.celesta2k19admin.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Celesta 2k19 Admin App"
    }
    val text: LiveData<String> = _text
}