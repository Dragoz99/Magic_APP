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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var userLocal = User("Jace_Beleren","AVATAR_SET_UP_U",20,0,0,0)
        val db = DataBaseHelper(this)
        db.insertData(userLocal)
        title = TAG
        Log.v(TAG, "onCreate")

    }
    override fun onStart(){
        super.onStart()
        Log.v(TAG, "onStart")

        viewConsole.setText("Created User Database Jace_Beleren")

    }



    fun openSinglePlayerActivity(v: View){



        val intent = Intent(this, Singleplayer::class.java)



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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if((requestCode == SECOND_ACTIVITY) and (resultCode == Activity.RESULT_OK)){
            val returnData = data?.getStringExtra("result")
        }
    }





}


