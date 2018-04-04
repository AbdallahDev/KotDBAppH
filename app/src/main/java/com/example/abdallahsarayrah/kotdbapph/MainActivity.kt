package com.example.abdallahsarayrah.kotdbapph

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSave.setOnClickListener {
            var obj = SchoolDB(this)
            var db = obj.writableDatabase
            db.execSQL("insert into students(name, mark) values(?,?)", arrayOf(editTextName.text.toString(), editText2Mark.text.toString()))

            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
        }
    }
}
