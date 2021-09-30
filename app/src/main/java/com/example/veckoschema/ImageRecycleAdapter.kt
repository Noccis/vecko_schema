package com.example.veckoschema

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageRecycleAdapter (val context: Context, val images: List<Image>) : RecyclerView.Adapter<ImageRecycleAdapter.ViewHolder>(){


    val layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val image = images[position]

        holder.imageView.setImageResource(image.imageId)
        holder.imageText.text = image.imageText
        holder.checkBox.isChecked = image.done
        holder.deleteButton.visibility = View.GONE

    }

    override fun getItemCount(): Int {      // Kan också skriva = images.size efter ()
        return images.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView = itemView.findViewById<ImageView>(R.id.imageView)
        val imageText = itemView.findViewById<TextView>(R.id.imageTextView)
        val checkBox = itemView.findViewById<CheckBox>(R.id.checkBox)
        val deleteButton = itemView.findViewById<ImageButton>(R.id.deleteButton)

    }

}