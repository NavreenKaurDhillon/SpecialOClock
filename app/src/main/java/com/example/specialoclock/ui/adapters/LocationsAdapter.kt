package com.example.specialoclock.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.specialoclock.R
import com.example.specialoclock.models.LocationsModelClass

class LocationsAdapter : ListAdapter<LocationsModelClass, LocationsAdapter.ItemViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.locations_home_recycler_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        var last_position: View? = null
        holder.bind(getItem(position))

        holder.itemView.setOnClickListener {
//            drawerItemsInterface?.openFragment(position)
        }
    }



    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: LocationsModelClass) = with(itemView) {

//            val stopName=itemView.findViewById<TextView>(R.id.airlineName)

//            stopName.setText(item.airlineName)
        }
    }


    class DiffCallback : DiffUtil.ItemCallback<LocationsModelClass>() {
        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: LocationsModelClass, newItem: LocationsModelClass): Boolean {
            return oldItem == newItem
        }

        override fun areItemsTheSame(
            oldItem: LocationsModelClass,
            newItem: LocationsModelClass
        ): Boolean {
            return oldItem.toString() == newItem.toString()

        }
    }
}

