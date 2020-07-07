package com.turskyi.intentfilter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.time.*
import java.text.SimpleDateFormat
import java.util.*

class ActivityTime : AppCompatActivity(R.layout.time){

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sdf = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        val time = sdf.format(Date(System.currentTimeMillis()))

        tvTime.text = time
    }
}