package com.vaca.arraylistassignmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gg=ArrayList<Int>()
        gg.add(1)
        gg.add(2)
        gg.add(3)
        Log.e("vaca",gg.size.toString())
        val hh = gg
        hh.removeAt(0)
        Log.e("vaca",gg.size.toString())
    }
}