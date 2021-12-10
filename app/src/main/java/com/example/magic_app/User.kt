package com.example.magic_app

import android.os.Parcel
import android.os.Parcelable
import android.provider.ContactsContract

open class User {
    var nickname : String ="Jace_Beleren"       //DEFAULT SETTING
    var avatar: String = "AVATAR_SET_UP_U"      //DEFAULT SETTING
    var life: Int = 20
    var redMana: Int =0
    var blueMana: Int =0
    var stormCounter : Int=0
    var whiteMana: Int =0
    var blackMana: Int =0
    var greenMana: Int =0
    var infectmana: Int =0
    var graveyard: Int=0
    var colorlessmana : Int = 0
    var turnCounter :Int=0


 constructor(nickname:String,
             avatar:String,
             life: Int,
             redmana:Int,
             bluemana:Int,
             stormcounter: Int,
             whitemana: Int,
             blackmana: Int,
             greenMana: Int,
             infect: Int,
             graveyard: Int,
             colorlessMana: Int,
             turncounter:Int){

     this.nickname = nickname
     this.avatar = avatar
     this.life = life
     this.redMana = redmana
     this.blueMana = bluemana
     this.stormCounter = stormcounter
     this.whiteMana = whitemana
     this.blackMana = blackmana
     this.greenMana = greenMana
     this.infectmana = infect
     this.graveyard = graveyard
     this.colorlessmana = colorlessMana
     this.turnCounter=turncounter


 }
    constructor(){

    }







}



