package com.example.magic_app

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.Executors

open class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    val SECOND_ACTIVITY = 1

    var userLocal = User("Jace_Beleren","AVATAR_SET_UP_U",20,0,0,0,0,0,0,0,0,0,0)
    val db = DataBaseHelper(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db.delateData()
        db.insertData(userLocal)
        title = TAG
        Log.v(TAG, "onCreate")
/*
        infoAppBtn.setOnClickListener({
            var data = db.readData()
            viewConsole.text = ""
            for(i in 0..(data.size -1)){
                viewConsole.append(" nickname "+data.get(i).nickname + "\n avatar " +
                        data.get(i).avatar+"\n stormcounter"+
                        data.get(i).stormCounter+" \n life" +
                        data.get(i).life+ "\n bluemana"+
                        data.get(i).blueMana+ "\n redmana"+
                        data.get(i).redMana + "\n "+
                        "")
            }
        })
*/

    }



    override fun onStart(){
        super.onStart()
        Log.v(TAG, "onStart")


    }




    fun openSinglePlayerActivity(v: View){
        val intent = Intent(this, Singleplayer::class.java)
        var vita = db.readData().get(0).life
        var mana_rosso = db.readData().get(0).redMana
        var mana_blue = db.readData().get(0).blueMana
        var mana_white = db.readData().get(0).whiteMana
        var mana_green = db.readData().get(0).greenMana
        var mana_black = db.readData().get(0).blackMana
        var storm = db.readData().get(0).stormCounter
        var turni = db.readData().get(0).turnCounter
        var mana_Cless = db.readData().get(0).colorlessmana
        var graveyard = db.readData().get(0).graveyard
        var infect = db.readData().get(0).infectmana


        intent.putExtra("Storm", storm)                 //storm
        intent.putExtra("Turn",turni)                   //turn
        intent.putExtra("Life", vita)                   //life
        intent.putExtra("Red", mana_rosso)              //red
        intent.putExtra("Blue", mana_blue)              //blue
        intent.putExtra("White",mana_white)             //white
        intent.putExtra("Black",mana_black)             //black
        intent.putExtra("Green",mana_green)             //green
        intent.putExtra("ColorLess",mana_Cless)         //color less
        intent.putExtra("Graveyard",graveyard)          //graveyard
        intent.putExtra("Infect",infect)


        startActivity(intent)

    }

    fun openMultiplayerActivity(v: View){
        val intent = Intent(this, MultiPlayer::class.java)
        startActivity(intent)
    }

    fun openOptionActivity(v: View){
        val intent = Intent(this, Option::class.java)
        startActivity(intent)
    }









}


