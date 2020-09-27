package com.nanoyatsu.example.bindAnimation.ui.main

import android.graphics.Color
import androidx.lifecycle.*

class MainViewModel : ViewModel() {
    private val _qty = MutableLiveData(0)
    val qty: LiveData<Int> = _qty

    val cardColor: LiveData<Int> = Transformations.map(_qty) {
        when (it) {
            0 -> Color.LTGRAY
            else -> Color.CYAN
        }
    }

    fun qtyPlus() = _qty.postValue(_qty.value!! + 1)
    fun qtyMinus() = _qty.postValue(_qty.value!! - 1)

}
