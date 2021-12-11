package com.example.magic_app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.multiplayer.*

class MultiPlayer: AppCompatActivity(), funzioni {
    val TAG = "Multiplayer"



    var totalLife=0

    var redManaCounter = 0
    var bluManaCounter = 0
    var greenManaCounter =0
    var blackManaCounter = 0
    var whiteManaCounter = 0
    var colorlessManaCounter = 0

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


        totalLife = intent.getIntExtra("Life",0)

        redManaCounter = intent.getIntExtra("Red",0)
        bluManaCounter = intent.getIntExtra("Blue",0)
        whiteManaCounter = intent.getIntExtra("White",0)
        greenManaCounter = intent.getIntExtra("Green",0)
        blackManaCounter = intent.getIntExtra("Black",0)
        colorlessManaCounter = intent.getIntExtra("ColorLess",0)

        turnCounter = intent.getIntExtra("Turn",0)
        graveyardCounter = intent.getIntExtra("Graveyard",0)
        infectCounter = intent.getIntExtra("Infect",0)
        stormCounter = intent.getIntExtra("Storm",0)

        life_point_user.text = "$totalLife"

        counter_red_mana.text = "$redManaCounter"
        counter_blue_mana.text = "$bluManaCounter"
        counter_white_mana.text = "$whiteManaCounter"
        counter_black_mana.text = "$blackManaCounter"
        counter_green_mana.text = "$greenManaCounter"
        counter_cless_mana.text = "$colorlessManaCounter"

        counter_storm.text = "$stormCounter"
        counter_poison.text = "$infectCounter"
        counter_grave.text = "$graveyardCounter"
        counter_turn.text = "$turnCounter"











    }

    override fun addLife(v: View) {
        totalLife += 1
        life_point_user.text = "$totalLife"
    }

    override fun lessLife(v: View) {
        totalLife -= 1
        life_point_user.text = "$totalLife"
    }

    override fun resetSinglePlayer(v: View) {
        TODO("Not yet implemented")
    }

    //===========================
    // RED MANA
    //===========================
    override fun addRedMana(v: View){
        redManaCounter +=1
        counter_red_mana.text = "$redManaCounter"
    }
    override fun lessRedMana(v: View){
        redManaCounter -=1
        counter_red_mana.text = "$redManaCounter"
    }

    //===========================
    // BLUE MANA
    //===========================
    override fun addBlueMana(v: View){
        bluManaCounter +=1
        counter_blue_mana.text = "$bluManaCounter"
    }
    override  fun lessBlueMana(v: View){
        bluManaCounter -=1
        counter_blue_mana.text = "$bluManaCounter"
    }
    //===========================
    // WHITE MANA
    //===========================
   override fun addWhiteMana(v: View){
        whiteManaCounter +=1
        counter_white_mana.text = "$whiteManaCounter"
    }
    override fun lessWhiteMana(v: View){
        whiteManaCounter -=1
        counter_white_mana.text = "$whiteManaCounter"
    }
    //===========================
    // Color Less mana
    //===========================
    override fun addColorLess(v: View) {
        colorlessManaCounter += 1
        counter_cless_mana.text ="$colorlessManaCounter"
    }

    override fun lessColorLess(v: View) {
        colorlessManaCounter -= 1
        counter_cless_mana.text ="$colorlessManaCounter"
    }

    //===========================
    // Storm Counter
    //===========================
    override fun addStorm(v: View) {
        TODO("Not yet implemented")
    }

    override fun lessStrom(v: View) {
        TODO("Not yet implemented")
    }

    //===========================
    // graveyard counter
    //===========================
    override fun addGraveyard(v: View) {
        TODO("Not yet implemented")
    }

    override fun lessGraveyard(v: View) {
        TODO("Not yet implemented")
    }

    //===========================
    // infect Counter
    //===========================
    override fun addInfect(v: View) {
        TODO("Not yet implemented")
    }

    override fun lessInfect(v: View) {
        TODO("Not yet implemented")
    }

    //===========================
    // turn counter
    //===========================
    override fun addTurn(v: View) {
        TODO("Not yet implemented")
    }

    override fun lessTurn(v: View) {
        TODO("Not yet implemented")
    }




    //***********************************************
    override fun openCronologia(v: View) {
        TODO("Not yet implemented")
    }

    override fun setTimeOpen(v: View) {
        TODO("Not yet implemented")
    }

    override fun addTimer(v: View) {
        TODO("Not yet implemented")
    }

    override fun stopTime(v: View) {
        TODO("Not yet implemented")
    }

    override fun resetTimer(v: View) {
        TODO("Not yet implemented")
    }

    override fun setTimer(v: View) {
        TODO("Not yet implemented")
    }
    //===========================
    // GREEN MANA
    //===========================
    override fun addGreenMana(v: View){
        greenManaCounter +=1
        counter_green_mana.text = "$greenManaCounter"
    }
    override fun lessGreenMana(v: View){
        greenManaCounter -=1
        counter_green_mana.text = "$greenManaCounter"
    }
    //===========================
    //  BLACK MANA
    //===========================
    override fun addBlackMana(v: View){
        blackManaCounter +=1
        counter_black_mana.text = "$blackManaCounter"
    }
    override fun lessBlackMana(v: View){
        blackManaCounter -=1
        counter_black_mana.text = "$blackManaCounter"
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
