package com.example.veckoschema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

 var weekDayInput = "default"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mondayButton = findViewById<Button>(R.id.mondayButton)

    }

    fun startMondayActivity(view: View) {
        val intent = Intent(this, WeekdaySchemeActivity::class.java)
        weekDayInput = "monday"
        intent.putExtra("weekday", weekDayInput )
        startActivity(intent)
    }
}