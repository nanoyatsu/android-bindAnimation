package com.nanoyatsu.example.bindAnimation.ui.bindingAdapter

import android.animation.ValueAnimator
import android.graphics.drawable.ColorDrawable
import android.view.View
import androidx.databinding.BindingAdapter


@BindingAdapter("backgroundColor_gradually")
fun bindBackgroundColorGradually(view: View, oldColor: Int, newColor: Int) {
    if (oldColor == newColor) return
    val background = view.background
    if (background is ColorDrawable) {
        ValueAnimator.ofArgb(oldColor, newColor).apply {
            duration = 500
            addUpdateListener { view.setBackgroundColor(it.animatedValue as Int) }
            start()
        }
    } else {
        view.setBackgroundColor(newColor)
    }
}

