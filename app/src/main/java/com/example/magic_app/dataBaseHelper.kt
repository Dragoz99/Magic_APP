/*
autore: Lorenzo Angella
progetto : magic_app
name file: dataBaseHelper.kt
description : database locale
 */


package com.example.magic_app

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val DATABASE_VERSION = 1
val DATABASE_NAME ="DataBaseLocalUser.db"
val TABLENAME = "Users"
val COL_NICKNAME= "nickname"
val COL_AVATAR = "avatar"
val COL_REDMANA = "red"
val COL_BLUEMANA = "blue"
val COL_STORM = "storm"
val COL_LIFE = "life"


open class DataBaseHelper(var context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION){
    override fun onCreate(db: SQLiteDatabase?){
        var createTable = "CREATE TABLE " + TABLENAME + " ("+
                COL_NICKNAME + " VARCHAR(20)," +
                COL_AVATAR + " VARCHAR(30)," +
                COL_REDMANA + " INTEGER,"+
                COL_BLUEMANA + " INTEGER,"+
                COL_STORM + " INTEGER,"+
                COL_LIFE + " INTEGER)"
        db?.execSQL(createTable)

    }

  override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS " + TABLENAME)
        onCreate(db)
    }
    open fun insertData(user: User) {
        val database =this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COL_NICKNAME,user.nickname)
        contentValues.put(COL_AVATAR, user.avatar)
        contentValues.put(COL_REDMANA,user.redMana)
        contentValues.put(COL_BLUEMANA,user.blueMana)
        contentValues.put(COL_STORM,user.stormCounter)
        contentValues.put(COL_LIFE,user.life)
        val result = database.insert(TABLENAME, null, contentValues)
        if (result == (0).toLong()) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }
    }
    open fun readData(): MutableList<User> {
        val list: MutableList<User> = ArrayList()
        val db = this.readableDatabase
        val query = "Select * from $TABLENAME"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            do {
                val user = User()
                //ignora le line rosse!!
                user.nickname = result.getString(result.getColumnIndex(COL_NICKNAME))
                user.avatar = result.getString(result.getColumnIndex(COL_AVATAR))
                user.redMana = result.getString(result.getColumnIndex(COL_REDMANA)).toInt()
                user.blueMana = result.getString(result.getColumnIndex(COL_BLUEMANA)).toInt()
                user.stormCounter = result.getString(result.getColumnIndex(COL_STORM)).toInt()
                user.life = result.getString(result.getColumnIndex(COL_STORM)).toInt()
                list.add(user)
            } while (result.moveToNext())
        }
        result.close()
        db.close()
        return list

    }
}