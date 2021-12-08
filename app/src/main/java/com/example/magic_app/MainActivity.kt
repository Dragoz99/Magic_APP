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

        val db = DataBaseHelper(this)
        var users = db.readData()
        if(users.size ==0){
            val toyUsers = arrayOf("Jace_Beleren AVATAR_SET_UP_U 20 0 0 0")
            toyUsers.forEach {
                val pos = it.split(" ")
                db.insertData(User(pos[0],pos[1],pos[2].toInt(),pos[3].toInt(),pos[4].toInt(),pos[5].toInt()))
            }
            users = db.readData()

        }

    }


    fun openSinglePlayerActivity(v: View){
        val intent = Intent(this, Singleplayer::class.java)
        startActivity(intent)
    }

    fun openMultiplayerActivity(v: View){
        val intent = Intent(this, MultiPlayer::class.java)
        startActivity(intent)
    }



}