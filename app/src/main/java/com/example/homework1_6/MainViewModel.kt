package com.example.homework1_6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var counter = 0
    private val _counterLv = MutableLiveData<Int>()

    val counterLv: LiveData<Int>
        get() = _counterLv

    fun inc() {
        _counterLv.value = ++counter

    }

    fun dec() {
        _counterLv.value = --counter
    }

}