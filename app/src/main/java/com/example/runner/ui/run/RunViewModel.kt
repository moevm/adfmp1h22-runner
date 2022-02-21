package com.example.runner.ui.run

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RunViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Бег"
    }
    val text: LiveData<String> = _text
}