package com.manan.test.kotlinhealthapp.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.core.app.NavUtils.*
import androidx.recyclerview.widget.GridLayoutManager
import com.manan.test.kotlinhealthapp.R
import com.manan.test.kotlinhealthapp.data.Util
import com.manan.test.kotlinhealthapp.data.DataModel
import com.manan.test.kotlinhealthapp.ui.adapter.PersonalRecordsAdapter
import com.manan.test.kotlinhealthapp.ui.adapter.VirtualRacesAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private var virtualRacesList = ArrayList<DataModel>()
    private var personalRecordsList = ArrayList<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        personalRecordsList = Util.getPersonalRecordsDataList()
        virtualRacesList = Util.getVirtualRacesDataList()
        setupUI()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        navigateUpFromSameTask(this)
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)

        }
    }

    /**
     * set up adapter to the recyclerview
     */
    private fun setupUI() {

        /*Recyclerview for Personal Records*/
        rv_personal_records?.layoutManager = GridLayoutManager(this,2)
        val personalAdapter   = PersonalRecordsAdapter(this, personalRecordsList)
        rv_personal_records?.adapter = personalAdapter
        personalAdapter.notifyDataSetChanged()

        /*Recyclerview for Virtual Races*/
        rv_virtual_races?.layoutManager = GridLayoutManager(this, 2)
        val virtualAdapter = VirtualRacesAdapter(this, virtualRacesList)
        rv_virtual_races?.adapter = virtualAdapter
        virtualAdapter.notifyDataSetChanged()
    }
}