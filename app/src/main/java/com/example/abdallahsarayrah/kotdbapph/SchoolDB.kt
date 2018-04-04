package com.example.abdallahsarayrah.kotdbapph

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by abdallah.sarayrah on 10/11/2017.
 */
class SchoolDB(context: Context) : SQLiteOpenHelper(context, "School.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table students(id integer primary key autoincrement, name text, mark integer)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

}