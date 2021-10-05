package com.example.veckoschema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

open class WeekdaySchemeActivity : AppCompatActivity() {

    lateinit var imageRecycleView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent)

       var weekdayInput = intent.getStringExtra("weekday")
        imageRecycleView = findViewById(R.id.imageRecyclerView)

        imageRecycleView.layoutManager = LinearLayoutManager(this)

        if (weekdayInput == "monday")
        imageRecycleView.adapter = ImageRecycleAdapter(this, monday)

    }
}