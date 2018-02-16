package com.example.vaibhav.notesapp

import android.content.Intent
import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import com.example.notesapp.SqliteHandler


import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  //  lateinit   var handler : SqliteHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

try {
    fab.setOnClickListener {

        val intent = Intent(this@MainActivity, AddActivity::class.java)
        startActivity(intent)

    }
} catch (e : Throwable) {
    e.printStackTrace()
}
/*
        handler = SqliteHandler(this)
        var list : ArrayList<String> = handler.fetchName()
        var adp : ArrayAdapter<String>
        adp=ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1,list)
        listview.adapter=adp


*/


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
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
