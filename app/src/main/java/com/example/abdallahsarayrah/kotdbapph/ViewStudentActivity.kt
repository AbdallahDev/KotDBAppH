package com.example.abdallahsarayrah.kotdbapph

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_student.*

class ViewStudentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_student)

        buttonFind.setOnClickListener {
            var obj = SchoolDB(this)
            var db = obj.readableDatabase
            var cursor = db.rawQuery("select * from students where id = ?", arrayOf(editText2ID.text.toString()))
            cursor.moveToFirst()

            editText2ID.setText(cursor.getString(cursor.getColumnIndex("id")))
            editText2Name.setText(cursor.getString(cursor.getColumnIndex("name")))
            editText2Mark.setText(cursor.getString(cursor.getColumnIndex("mark")))
        }
    }
}
