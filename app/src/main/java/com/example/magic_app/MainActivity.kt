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
    open var userLocal = User("Jace_Beleren","AVATAR_SET_UP_U",20,0,0,0)
    open val db = DataBaseHelper(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = TAG
        Log.v(TAG, "onCreate")
        //Log.v(TAG, "create thread")

        //Log.v(TAG, "finish thread")
       /* val db = DataBaseHelper(this)
        var users = db.readData()
        if(users.size ==0){//creazione se non c'è nulla sul database
            // l'app imposta l'utente di default
            val toyUsers = arrayOf("Jace_Beleren AVATAR_SET_UP_U 20 0 0 0")
            toyUsers.forEach {
                val pos = it.split(" ")
                db.insertData(User(pos[0],pos[1],pos[2].toInt(),pos[3].toInt(),pos[4].toInt(),pos[5].toInt()))

            }
            users = db.readData()


        }*/

    }
    override fun onStart(){
        super.onStart()
        Toast.makeText(getApplicationContext(),"Now onStart() calls", Toast.LENGTH_LONG).show();
        db.insertData(userLocal)
        viewConsole.setText("Created User Database Jace_Beleren")
    }



    fun openSinglePlayerActivity(v: View){
        val intent = Intent(this, Singleplayer::class.java)

        startActivity(intent)
        //createThread_db()
    }

    fun openMultiplayerActivity(v: View){
        val intent = Intent(this, MultiPlayer::class.java)
        startActivity(intent)
    }
    /*fun createThread_db(){
        val executor = Executors.newSingleThreadExecutor()
        executor.execute{
            val db = DataBaseHelper(this)
           // var users = db.readData()
            val toyUsers = arrayOf("Jace_Beleren AVATAR_SET_UP_U 20 0 0 0")
            toyUsers.forEach {
                val pos = it.split(" ")
                db.insertData(User(pos[0],pos[1],pos[2].toInt(),pos[3].toInt(),pos[4].toInt(),pos[5].toInt()))
            }
        }
    }*/



}