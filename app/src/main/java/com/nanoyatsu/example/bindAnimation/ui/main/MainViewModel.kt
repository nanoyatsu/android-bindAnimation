package com.nanoyatsu.example.bindAnimation.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _qty = MutableLiveData(0)
    val qty: LiveData<Int> = _qty

    fun qtyPlus() = _qty.postValue(_qty.value!! + 1)
    fun qtyMinus() = _qty.postValue(_qty.value!! - 1)

}
