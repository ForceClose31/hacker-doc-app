package com.example.hackerlist.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hackerlist.models.Hacker
import com.example.hackerlist.R

class HackerAdapter(
    private val hackerList: List<Hacker>,
    private val context: Context,
    private val itemClickListener: (Hacker) -> Unit
) : RecyclerView.Adapter<HackerAdapter.HackerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HackerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_hacker, parent, false)
        return HackerViewHolder(view)
    }

    override fun onBindViewHolder(holder: HackerViewHolder, position: Int) {
        val hacker = hackerList[position]
        holder.bind(hacker, itemClickListener)
    }

    override fun getItemCount(): Int {
        return hackerList.size
    }

    class HackerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val hackerImage: ImageView = itemView.findViewById(R.id.hackerImage)
        private val hackerName: TextView = itemView.findViewById(R.id.hackerName)
        private val hackerOverview: TextView = itemView.findViewById(R.id.hackerOverview)

        fun bind(hacker: Hacker, itemClickListener: (Hacker) -> Unit) {
            hackerImage.setImageResource(hacker.imageResId)
            hackerName.text = hacker.name
            hackerOverview.text = hacker.description

            itemView.setOnClickListener {
                itemClickListener(hacker)
            }
        }
    }
}
