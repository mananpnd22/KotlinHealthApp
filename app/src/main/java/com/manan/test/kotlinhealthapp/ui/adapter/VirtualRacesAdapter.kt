package com.manan.test.kotlinhealthapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.manan.test.kotlinhealthapp.R
import com.manan.test.kotlinhealthapp.data.DataModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.layout_health_achievement.view.*

class VirtualRacesAdapter(private var context: Context, private var virtualRaces: ArrayList<DataModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.layout_health_achievement, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val virtualRacesList = virtualRaces[position]
        viewHolder.itemView.tv_health_achievement_title.text = virtualRacesList.title
        viewHolder.itemView.tv_health_achievement_subtitle.text = virtualRacesList.subtitle
        Picasso.with(context).load(virtualRacesList.image).into(viewHolder.itemView.iv_health_achievement)
    }

    override fun getItemCount(): Int {
        return virtualRaces.size
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val tv_health_achievement_title = v.tv_health_achievement_title
        val tv_health_achievement_subtitle = v.tv_health_achievement_subtitle
        val iv_health_achievement = v.iv_health_achievement
    }

}
