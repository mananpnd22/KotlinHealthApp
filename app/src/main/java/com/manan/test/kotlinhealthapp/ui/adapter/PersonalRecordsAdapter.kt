package com.manan.test.kotlinhealthapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.manan.test.kotlinhealthapp.data.DataModel
import com.manan.test.kotlinhealthapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.layout_health_achievement.view.*

class PersonalRecordsAdapter(private var context: Context, private var personalRecords: ArrayList<DataModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.layout_health_achievement, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val personalRecordsListData = personalRecords[position]
        holder.itemView.tv_health_achievement_title.text = personalRecordsListData.title
        holder.itemView.tv_health_achievement_subtitle.text = personalRecordsListData.subtitle
        Picasso.with(context).load(personalRecordsListData.image).into(holder.itemView.iv_health_achievement)

    }

    override fun getItemCount(): Int {
        return personalRecords.size
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val tv_health_achievement_title = v.tv_health_achievement_title
        val tv_health_achievement_subtitle = v.tv_health_achievement_subtitle
        val iv_health_achievement = v.iv_health_achievement
    }

}