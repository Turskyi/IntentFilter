package com.turskyi.intentfilter

import android.os.Bundle
import android.app.Activity
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class ActivityTime : Activity(){

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.time)

        val sdf = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        val time = sdf.format(Date(System.currentTimeMillis()))

        val tvTime = findViewById<TextView>(R.id.tvTime)
        tvTime.text = time
    }
}