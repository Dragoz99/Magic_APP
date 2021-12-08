package com.example.magic_app

import android.provider.ContactsContract

class User {
  var nickname : String ="Jace Beleren"       //DEFAULT SETTING
  var avatar: String = "AVATAR_SET_UP_U"      //DEFAULT SETTING
  var life: Int = 20
  var redMana: Int =0
  var blueMana: Int =0
  var stormCounter : Int=0

 constructor(nickname:String,avatar:String, life: Int,redMana:Int,blueMana:Int, stormCounter: Int){
     this.nickname = nickname
     this.avatar = avatar
     this.life = life
     this.redMana = redMana
     this.blueMana = blueMana
     this.stormCounter = stormCounter
 }






}



