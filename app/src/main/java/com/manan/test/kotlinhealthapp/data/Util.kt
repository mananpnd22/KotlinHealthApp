package com.manan.test.kotlinhealthapp.data

import com.manan.test.kotlinhealthapp.R

object Util {

    fun getPersonalRecordsDataList() : ArrayList<DataModel>{
        val list : ArrayList<DataModel> = ArrayList()
        list.add(DataModel("Longest Run", "00:00", R.drawable.longestrun))
        list.add(DataModel("Highest Elevation", "2095 ft", R.drawable.highestelevation))
        list.add(DataModel("Fastest 5K", "00:00", R.drawable.fastest5k))
        list.add(DataModel("10K",  "00:00:00", R.drawable.tenk))
        list.add(DataModel("Half Marathon", "00:00", R.drawable.halfmarathon))
        list.add(DataModel("Marathon", "Not Yet", R.drawable.halfmarathon))
        return list
    }

    fun getVirtualRacesDataList() : ArrayList<DataModel>{
        val list : ArrayList<DataModel> = ArrayList()
        list.add(DataModel("Virtual Half Marathon Race", "00:00", R.drawable.runkeeper_icon))
        list.add(DataModel("Tokyo-Hakone Ekiden 2020", "00:00:00", R.drawable.runkeeper_icon))
        list.add(DataModel("Virtual 10K Race", "00:00:00", R.drawable.runkeeper_icon))
        list.add(DataModel("Hakone Ekiden", "00:00:00", R.drawable.runkeeper_icon))
        list.add(DataModel("Mizuno Singapore Ekiden 2015", "00:00:00", R.drawable.runkeeper_icon))
        list.add(DataModel("Virtual 5K Race", "23:07", R.drawable.runkeeper_icon))
        return list
    }
}