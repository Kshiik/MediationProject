package com.example.mediationproject.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mediationproject.R
import com.example.mediationproject.data.model.State

class StateAdapter (private var itemList: MutableList<State>) : RecyclerView.Adapter<StateViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_state, parent, false)
        return StateViewHolder(view)
    }

    override fun onBindViewHolder(holder: StateViewHolder, position: Int) {
        holder.title.text = itemList[position].title
        holder.text_state.text = itemList[position].text_state
        holder.image_state.setImageResource(itemList[position].image_state)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}