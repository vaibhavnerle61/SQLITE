package com.example.sqlite2

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by vaibhav on 5/2/18.
 */
class SqliteHandler (context : Context) : SQLiteOpenHelper(context,dbname,factory,version)
{


    companion object {
        internal  val dbname ="mydatabase"
        internal val factory=null
        internal val version= 1
    }

    fun insertName  (name :String){
        val db : SQLiteDatabase =writableDatabase
        val values :ContentValues
        values=ContentValues()
        values.put("",name)
        db.insert("student",null,values)
    }

    fun fetchName():ArrayList<String>
    {
        var list : ArrayList<String>
        list = arrayListOf()

        val db :SQLiteDatabase =readableDatabase

        val c = db.rawQuery("select * from student",null)

        while(c.moveToNext())
        {
            var name :String = c.getString(c.getColumnIndex("name"))
            list.add(name)

        }
        return list
    }





    override fun onCreate(p0: SQLiteDatabase?) {

p0?.execSQL("create table student (id integer primary key autoincrement,name varchar(256))")

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}