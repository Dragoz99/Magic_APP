package com.example.magic_app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.singleplayer.*

class Singleplayer: AppCompatActivity() {
    val TAG = "Singleplayer"
    var returnValue = 0.0


    var TOTAL_LIFE = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.singleplayer)
        val actionBar = supportActionBar

        actionBar!!.title= "SinglePlayer"
        actionBar.setDisplayHomeAsUpEnabled(true)

        LifeView.text = "$TOTAL_LIFE"

    }
    fun addLife(v: View){
        TOTAL_LIFE += 1
        LifeView.text = "$TOTAL_LIFE"
    }
    fun lessLife(v: View){
        TOTAL_LIFE -= 1
        LifeView.text = "$TOTAL_LIFE"
    }
    fun resetSinglePlayer(v: View){
        TOTAL_LIFE = 20
        LifeView.text = "$TOTAL_LIFE"
    }



}