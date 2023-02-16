package com.example.library_calender_custom_view

import android.content.Context
import android.widget.Toast

class ToastMessage {
    fun toast(context: Context?, msg: String?) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}