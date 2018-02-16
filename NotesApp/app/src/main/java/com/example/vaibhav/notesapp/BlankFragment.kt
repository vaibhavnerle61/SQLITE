package com.example.vaibhav.notesapp


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.notesapp.SqliteHandler
import kotlinx.android.synthetic.main.fragment_blank.*


/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {

    lateinit   var handler : SqliteHandler


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_blank, container, false)


/*
        handler = SqliteHandler(this)
        var list : ArrayList<String> = handler.fetchName()
        var adp : ArrayAdapter<String>
        adp = ArrayAdapter(this@BlankFragment,android.R.layout.simple_list_item_1,list)
        lstvw.adapter=adp




*/



    }




}// Required empty public constructor
