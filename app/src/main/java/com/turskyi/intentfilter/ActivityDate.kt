package com.turskyi.intentfilter

import android.os.Bundle
import android.app.Activity
import android.widget.TextView
import kotlinx.android.synthetic.main.date.*
import java.text.SimpleDateFormat
import java.util.*

class ActivityDate : Activity(){

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.date)

        val sdf = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault())
        val date = sdf.format(Date(System.currentTimeMillis()))

        val tvDate = findViewById<TextView>(R.id.tvDate)
        tvDate.text = date
    }
}