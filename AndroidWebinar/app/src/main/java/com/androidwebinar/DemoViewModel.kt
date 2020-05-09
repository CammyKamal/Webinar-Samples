package com.androidwebinar

import android.util.Log
import androidx.lifecycle.ViewModel

class DemoViewModel : ViewModel() {

    var text: String = "Demo Webinar"

    fun click() {
        Log.e("View", "Click")
    }

}