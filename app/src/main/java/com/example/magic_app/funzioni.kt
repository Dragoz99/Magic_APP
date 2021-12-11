package com.example.magic_app

import android.view.View
import kotlinx.android.synthetic.main.singleplayer.*

interface funzioni {




    fun addLife(v: View)
    fun lessLife(v: View)
    fun resetSinglePlayer(v: View)
//---------------------------------------------------------
    fun addRedMana(v: View)
    fun lessRedMana(v: View)

    fun addBlueMana(v: View)
    fun lessBlueMana(v: View)

    fun addGreenMana(v: View)
    fun lessGreenMana(v:View)

    fun addBlackMana(v: View)
    fun lessBlackMana(v: View)

    fun addWhiteMana(v: View)
    fun lessWhiteMana(v: View)

    fun addColorLess(v: View)
    fun lessColorLess(v: View)
//--------------------------------------------------------
    fun addStorm(v: View)
    fun lessStrom(v: View)

    fun addGraveyard(v: View)
    fun lessGraveyard(v: View)

    fun addInfect(v: View)
    fun lessInfect(v: View)

    fun addTurn(v:View)
    fun lessTurn(v:View)
//--------------------------------------------------------

    fun openCronologia(v: View)
    fun setTimeOpen(v:View)
    fun addTimer(v: View)
    fun stopTime(v: View)
    fun resetTimer(v: View)
    fun setTimer(v: View)


}