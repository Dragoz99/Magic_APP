package com.example.magic_app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.multiplayer.*

class MultiPlayer: AppCompatActivity() {
    val TAG = "Multiplayer"
    var returnValue = 0.0
    var redManaCounter = 0
    var bluManaCounter = 0
    var greenManaCounter =0
    var blackManaCounter = 0
    var whiteManaCounter = 0
    var stormCounter =0
    var infectCounter =0
    var turnCounter =0
    var graveyardCounter =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.multiplayer)
        val actionBar = supportActionBar

        actionBar!!.title= "Multiplayer"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
//===========================
    // RED MANA
//===========================
    fun addRedMana(v: View){
        redManaCounter +=1
        counter_red_mana.text = "$redManaCounter"
    }
    fun lessRedMana(v: View){
        redManaCounter -=1
        counter_red_mana.text = "$redManaCounter"
    }

//===========================
    // BLUE MANA
//===========================
    fun addBlueMana(v: View){
        bluManaCounter +=1
        counter_blue_mana.text = "$bluManaCounter"
    }
    fun lessBlueMana(v: View){
        bluManaCounter -=1
        counter_blue_mana.text = "$bluManaCounter"
    }
//===========================
    // WHITE MANA
//===========================
    fun addWhiteMana(v: View){
        whiteManaCounter +=1
        counter_white_mana.text = "$whiteManaCounter"
    }
    fun lessWhiteMana(v: View){
        whiteManaCounter -=1
        counter_white_mana.text = "$whiteManaCounter"
    }
//===========================
    // GREEN MANA
//===========================

    fun addGreenMana(v: View){
        greenManaCounter +=1
        counte_green_mana.text = "$greenManaCounter"
    }
    fun lessGreenMana(v: View){
        greenManaCounter -=1
        counte_green_mana.text = "$greenManaCounter"
    }
//===========================
    //  BLACK MANA
//===========================
    fun addBlackMana(v: View){
        blackManaCounter +=1
        counter_black_mana.text = "$blackManaCounter"
    }
    fun lessBlackMana(v: View){
        blackManaCounter -=1
        counter_black_mana.text = "$blackManaCounter"
    }
//===========================
    //  STORM COUNTER
//===========================
    fun addStormCounter(v: View){
    stormCounter +=1
        counter_storm.text = "$stormCounter"
    }
    fun lessStormCounter(v: View){
        stormCounter -=1
        counter_storm.text = "$stormCounter"
    }

    //====================
    // reset btn
    //====================
    fun resetbutton(v:View){
        redManaCounter = 0
        bluManaCounter = 0
        greenManaCounter =0
        blackManaCounter = 0
        whiteManaCounter = 0
        stormCounter =0
        infectCounter =0
        turnCounter =0
        graveyardCounter =0
    }

}
