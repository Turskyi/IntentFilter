package com.turskyi.intentfilter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.date.*
import java.text.SimpleDateFormat
import java.util.*

class ActivityDateEx : AppCompatActivity(R.layout.date){

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sdf = SimpleDateFormat("EEE, MMM d, yyyy", Locale.getDefault())
        val date = sdf.format(Date(System.currentTimeMillis()))

        tvDate.text = date
    }
}