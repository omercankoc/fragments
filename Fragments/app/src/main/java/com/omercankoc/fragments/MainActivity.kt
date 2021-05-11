package com.omercankoc.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fragmentFirst(view : View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val firstFragment = FirstFragment()
        fragmentTransaction.replace(R.id.frameLayoutFirst,firstFragment).commit()
    }

    fun fragmentSecond(view : View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val secondFragment = SecondFragment()
        fragmentTransaction.replace(R.id.frameLayoutFirst,secondFragment).commit()
    }
}