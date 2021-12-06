package com.example.magic_app

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    val SECOND_ACTIVITY = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = TAG
        Log.v(TAG, "onCreate")
    }


    fun openSinglePlayerActivity(v: View){

        val intent = Intent(this, Singleplayer::class.java)
        startActivity(intent)
    }



}