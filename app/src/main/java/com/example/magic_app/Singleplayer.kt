package com.example.magic_app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.singleplayer.*

class Singleplayer: AppCompatActivity() {

    val INDEX_LIFE =2
    var TOTAL_LIFE =20


   // var userLocal = User("Jace_Beleren","AVATAR_SET_UP_U",20,0,0,0)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.singleplayer)
        val actionBar = supportActionBar

        actionBar!!.title= "SinglePlayer"
        actionBar.setDisplayHomeAsUpEnabled(true)

       /* val db = DataBaseHelper(this)
        var datiUtente = db.readData()
       var d= datiUtente.get(INDEX_LIFE)*/


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