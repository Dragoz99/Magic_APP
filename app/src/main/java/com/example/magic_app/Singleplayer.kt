package com.example.magic_app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.singleplayer.*

class Singleplayer: AppCompatActivity(),funzioni{

    var TOTAL_LIFE = 0

    var RED_MANA =0
    var BLUE_MANA = 0
    var WHITE_MANA =0
    var GREEN_MANA =0
    var BLACK_MANA =0
    var COLOR_LESS_MANA=0

    var STORM = 0
    var INFECT =0
    var TURN =0
    var GRAVEYARD =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.singleplayer)
        val actionBar = supportActionBar

        actionBar!!.title= "SinglePlayer"
        actionBar.setDisplayHomeAsUpEnabled(true)

        TOTAL_LIFE = intent.getIntExtra("Life",0)

        RED_MANA = intent.getIntExtra("Red",0)
        BLUE_MANA = intent.getIntExtra("Blue",0)
        WHITE_MANA = intent.getIntExtra("White",0)
        GREEN_MANA = intent.getIntExtra("Green",0)
        BLACK_MANA = intent.getIntExtra("Black",0)
        COLOR_LESS_MANA = intent.getIntExtra("ColorLess",0)


        TURN = intent.getIntExtra("Turn",0)
        GRAVEYARD = intent.getIntExtra("Graveyard",0)
        INFECT = intent.getIntExtra("Infect",0)
        STORM = intent.getIntExtra("Storm",0)

        LifeView.text = "$TOTAL_LIFE"

        textViewRedMana.text = "$RED_MANA"
        textViewBlueMana.text = "$BLUE_MANA"
        textViewGreenMana.text = "$GREEN_MANA"
        textViewBlackMana.text = "$BLACK_MANA"
        textViewWhiteMana.text = "$WHITE_MANA"
        textViewColorlessMana.text  ="$COLOR_LESS_MANA"


        textViewTurn.text ="$TURN"
        textViewStorm.text ="$STORM"
        textViewGraveyard.text = "$GRAVEYARD"
        textViewInfect.text ="$INFECT"
    }
/*==========================================================
* ------LIFE FUN
* =========================================================*/

    override fun addLife(v: View){
        TOTAL_LIFE += 1
        LifeView.text = "$TOTAL_LIFE"
    }
    override fun lessLife(v: View){
        TOTAL_LIFE -= 1
        LifeView.text = "$TOTAL_LIFE"
    }
    override fun resetSinglePlayer(v: View){
        TOTAL_LIFE = 20
        RED_MANA =0
        BLUE_MANA = 0
        WHITE_MANA =0
        GREEN_MANA =0
        BLACK_MANA =0
        COLOR_LESS_MANA=0

        STORM = 0
        INFECT =0
        TURN =0
        GRAVEYARD =0
        LifeView.text = "$TOTAL_LIFE"
        textViewRedMana.text = "$RED_MANA"
        textViewBlueMana.text = "$BLUE_MANA"
        textViewGreenMana.text = "$GREEN_MANA"
        textViewBlackMana.text = "$BLACK_MANA"
        textViewWhiteMana.text = "$WHITE_MANA"
        textViewColorlessMana.text = "$COLOR_LESS_MANA"
        textViewInfect.text = "$INFECT"
        textViewTurn.text = "$TURN"
        textViewStorm.text = "$STORM"
        textViewGraveyard.text ="$GRAVEYARD"
    }
/*==========================================================
* ------COLOR FUN
* =========================================================*/
   //-------RED---------
    override fun addRedMana(v: View){
        RED_MANA +=1
        textViewRedMana.text = "$RED_MANA"
    }
    override fun lessRedMana(v: View){
        RED_MANA -=1
        textViewRedMana.text = "$RED_MANA"
    }
    //-------BLUE-------
    override fun addBlueMana(v: View){
        BLUE_MANA += 1
        textViewBlueMana.text = "$BLUE_MANA"
    }
    override fun lessBlueMana(v: View){
        BLUE_MANA -= 1
        textViewBlueMana.text = "$BLUE_MANA"
    }
    //------GREEN-----
    override fun addGreenMana(v: View){
        GREEN_MANA += 1
        textViewGreenMana.text = "$GREEN_MANA"
    }
    override fun lessGreenMana(v:View){
        GREEN_MANA -= 1
        textViewGreenMana.text = "$GREEN_MANA"
    }
    //------BLACK-----
    override fun addBlackMana(v: View) {
        BLACK_MANA += 1
        textViewBlackMana.text = "$BLACK_MANA"
    }
    override fun lessBlackMana(v: View) {
        BLACK_MANA -= 1
        textViewBlackMana.text = "$BLACK_MANA"
    }
    //------WHITE-----
    override fun addWhiteMana(v: View) {
        WHITE_MANA += 1
        textViewWhiteMana.text = "$WHITE_MANA"
    }
    override fun lessWhiteMana(v: View) {
        WHITE_MANA -= 1
        textViewWhiteMana.text = "$WHITE_MANA"
    }
    //------COLOR LESS-----
    override fun addColorLess(v: View) {
        COLOR_LESS_MANA += 1
        textViewColorlessMana.text = "$COLOR_LESS_MANA"
    }
    override fun lessColorLess(v: View) {
        COLOR_LESS_MANA -= 1
        textViewColorlessMana.text = "$COLOR_LESS_MANA"
    }

    /*==========================================================
 * ------TOKEN FUN
 * =========================================================*/


    //------STORM-----
    override fun addStorm(v: View){
        STORM +=1
        textViewStorm.text = "$STORM"
    }
    override fun lessStrom(v: View){
        STORM -= 1
        textViewStorm.text = "$STORM"
    }
    //------graveyard-----
    override fun addGraveyard(v: View) {
        GRAVEYARD += 1
        textViewGraveyard.text ="$GRAVEYARD"
    }
    override fun lessGraveyard(v: View) {
        GRAVEYARD -= 1
        textViewGraveyard.text ="$GRAVEYARD"
    }
    //--------infect-------
    override fun addInfect(v: View) {
        INFECT += 1
        textViewInfect.text = "$INFECT"
    }
    override fun lessInfect(v: View) {
        INFECT -= 1
        textViewInfect.text = "$INFECT"
    }
    //--------turn-------
    override fun addTurn(v: View) {
        TURN += 1
        textViewTurn.text = "$TURN"

    }
    override fun lessTurn(v: View) {
        TURN -= 1
        textViewTurn.text = "$TURN"
    }
    /*==========================================================
  * ------BTN BOTTOM FUN
  * =========================================================*/

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


}