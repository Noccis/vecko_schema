package com.example.veckoschema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ParentActivity : AppCompatActivity() {

    lateinit var imageRecycleView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent)

        imageRecycleView = findViewById(R.id.imageRecyclerView)

        imageRecycleView.layoutManager = LinearLayoutManager(this)

        imageRecycleView.adapter = ImageRecycleAdapter(this, DataManager.images)

    }
}