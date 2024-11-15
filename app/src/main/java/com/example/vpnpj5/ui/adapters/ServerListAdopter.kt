package com.example.vpnpj5.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.vpnpj5.R
import com.example.vpnpj5.data.model.ServerListItemModel

class ServerListAdopter(private val dataList: List<ServerListItemModel>) :
    RecyclerView.Adapter<ServerListAdopter.ServerListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServerListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.serverlistdesign, parent, false)
        return ServerListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ServerListViewHolder, position: Int) {
        val itemPosition = dataList[position]

        holder.imageView.setImageResource(itemPosition.imageFlage)
        holder.text.text = itemPosition.textTitle
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


    class ServerListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.img_usflage)
        val text: TextView = itemView.findViewById(R.id.tv_UnitedState)
    }
}

