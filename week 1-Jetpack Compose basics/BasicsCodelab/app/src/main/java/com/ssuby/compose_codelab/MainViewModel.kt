package com.ssuby.compose_codelab

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _names: MutableLiveData<List<String>> by lazy {
        MutableLiveData(List(1000) { "$it" })
    }
    val names: LiveData<List<String>> get() = _names
}