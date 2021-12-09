package com.example.magic_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.option_layout.*

class Option : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.option_layout)

        val actionBar = supportActionBar

        actionBar!!.title= "Option"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val db = DataBaseAvatar(this)
        var avatar = db.readData()
        if(avatar.size==0){
            // in sospeso
//--------------------------------------------------------------------------
            val toyUsers = arrayOf(

                "AVATAR_SET_UP_GU liliana","AVATAR_SET_UP_U teferi"
            )
            toyUsers.forEach {
                val pos = it.split(" ")
                db.insertData(Avatar(pos[0],pos[1]))
            }
            //db.insertData(Avatar("uno","ajani"))
            avatar = db.readData()
        lista.adapter = AvatarSelectorAdapter(this,avatar)

        }
//--------------------------------------------------------------------------

    }
}