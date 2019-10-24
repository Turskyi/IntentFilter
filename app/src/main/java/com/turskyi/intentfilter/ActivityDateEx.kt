package com.turskyi.intentfilter

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class ActivityDateEx : Activity(){

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.date)

        val sdf = SimpleDateFormat("EEE, MMM d, yyyy", Locale.getDefault())
        val date = sdf.format(Date(System.currentTimeMillis()))

        val tvDate = findViewById<TextView>(R.id.tvDate)
        tvDate.text = date
    }
}