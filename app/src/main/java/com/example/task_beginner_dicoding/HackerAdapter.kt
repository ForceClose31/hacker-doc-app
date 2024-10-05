package com.example.task_beginner_dicoding.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.task_beginner_dicoding.R
import com.example.task_beginner_dicoding.models.Hacker

class HackerAdapter(
    private val hackerList: ArrayList<Hacker>,
    private val context: Context,
    private val onClick: (Hacker) -> Unit
) : RecyclerView.Adapter<HackerAdapter.HackerViewHolder>() {

    inner class HackerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val hackerName: TextView = itemView.findViewById(R.id.hackerName)
        val hackerDescription: TextView = itemView.findViewById(R.id.hackerDescription)
        val hackerImage: ImageView = itemView.findViewById(R.id.hackerImage)

        init {
            itemView.setOnClickListener {
                onClick(hackerList[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HackerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_hacker, parent, false)
        return HackerViewHolder(view)
    }

    override fun onBindViewHolder(holder: HackerViewHolder, position: Int) {
        val hacker = hackerList[position]
        holder.hackerName.text = hacker.name
        holder.hackerDescription.text = hacker.description
        holder.hackerImage.setImageResource(hacker.mainImage)
    }

    override fun getItemCount(): Int {
        return hackerList.size
    }
}
