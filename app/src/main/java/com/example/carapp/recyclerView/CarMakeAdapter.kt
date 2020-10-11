package com.example.carapp.recyclerView

import ASTON_MARTIN
import BMW
import BUELL
import BUGATTI
import JAGUAR
import LAND_ROVER
import MASERATI
import MERCEDES
import MINI
import ROLLS_ROYCE
import TESLA
import TOYOTA
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carapp.R
import com.example.carapp.network.CarMake
import com.example.carapp.ui.DetailClickListener

class CarMakeAdapter(private val onClickListener: DetailClickListener): RecyclerView.Adapter<ViewHolder>() {

    var data = listOf<CarMake>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.carMake_textView.text = item.makeName
        holder.carMake_imageView.setImageResource(when (item.makeId){
            ASTON_MARTIN -> R.drawable.aston_martin
            TESLA -> R.drawable.tesla
            MASERATI -> R.drawable.maserati
            LAND_ROVER -> R.drawable.land_rover
            ROLLS_ROYCE -> R.drawable.rolls_royce
            BUELL -> R.drawable.buell
            TOYOTA -> R.drawable.toyota
            MERCEDES -> R.drawable.mercedes
            JAGUAR -> R.drawable.jaguar
            BMW -> R.drawable.bmw
            BUGATTI -> R.drawable.bugatti
            MINI -> R.drawable.mini_cooper
            else -> R.drawable.car_make_not_found
        })
        holder.itemView.setOnClickListener {
            onClickListener.detailClickListener(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.text_make_view, parent, false) as View
        return ViewHolder(view)

    }

}

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val carMake_textView = itemView.findViewById<TextView>(R.id.carMake_textView)
    val carMake_imageView = itemView.findViewById<ImageView>(R.id.carMake_imageView)
}
