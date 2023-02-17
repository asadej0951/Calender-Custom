package com.example.calender_custom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.library_calender_custom_view.ToastMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastMessage().toast(this,"Test")
    }
}