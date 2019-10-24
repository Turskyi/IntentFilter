package com.turskyi.intentfilter

import android.content.Intent
import android.os.Bundle
import android.app.Activity
import android.view.View
import android.widget.Button

class MainActivity : Activity(), View.OnClickListener {

    /**
     * @Description Called when the activity is first created.
     * */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTime = findViewById<Button>(R.id.btnTime)
        val btnDate = findViewById<Button>(R.id.btnDate)

        btnTime.setOnClickListener(this)
        btnDate.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent: Intent

        when (v.id) {
            R.id.btnTime -> {
                intent = Intent("ua.turskyi.intent.action.showtime")
                startActivity(intent)
            }
            R.id.btnDate -> {
                intent = Intent("ua.turskyi.intent.action.showdate")
                startActivity(intent)
            }
        }
    }
}