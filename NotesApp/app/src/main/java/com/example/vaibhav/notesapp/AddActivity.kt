package com.example.vaibhav.notesapp


import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.notesapp.SqliteHandler
//import com.example.notesapp.SqliteHandler
import kotlinx.android.synthetic.main.activity_add.*

 class AddActivity : AppCompatActivity() {
lateinit var handler : SqliteHandler


     override fun onCreate(savedInstanceState: Bundle?) {
                 super.onCreate(savedInstanceState)
                 setContentView(R.layout.activity_add)

                                  btnadd.setOnClickListener {

                                      insert()

                                      val intent = Intent(this@AddActivity,MainActivity::class.java)
                                      startActivity(intent)


                         }



     }




    private fun insert(){


         handler = SqliteHandler(this)

         val txt: String = edttitle.text.toString()
         val txtmsg: String = edtmsg.text.toString()
         handler.insertName(txt, txtmsg)
         Toast.makeText(this@AddActivity, "Inserted Successfully", Toast.LENGTH_SHORT).show()

     }
}


