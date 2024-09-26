package com.example.mediationproject.ui.adapter

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mediationproject.R

class StateViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    val title: TextView = itemView.findViewById(R.id.state_title)
    val text_state: TextView = itemView.findViewById(R.id.state_text)
    val btn_state: Button = itemView.findViewById(R.id.state_button)
    val image_state: ImageView = itemView.findViewById(R.id.state_image)
}