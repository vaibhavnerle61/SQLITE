package com.example.sqlite2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var handler : SqliteHandler
        handler = SqliteHandler(this@MainActivity)
        btnadd.setOnClickListener{
            val txt :String = editText.text.toString()
            handler.insertName(txt)
            Toast.makeText(this@MainActivity,"Inserted Succefully",Toast.LENGTH_SHORT).show()
        }

            var list : ArrayList<String> = handler.fetchName()
            var adp :ArrayAdapter<String>
            adp=ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1,list)
            listViewEx.adapter=adp





    }
}
