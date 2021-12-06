package com.example.magic_app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Singleplayer: AppCompatActivity() {
    val TAG = "Singleplayer"
    var returnValue = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.singleplayer)
        val actionBar = supportActionBar

        actionBar!!.title= "SinglePlayer"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }



}