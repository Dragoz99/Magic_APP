package com.example.magic_app

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val DATABASE_VERSION_ = 1
val DATABASE_NAME_ = "Avatar.db"
val TABLENAME_ ="avatar"
val COL_ID_AVATAR = "code"
val COL_NAME_AVATAR = "name"



class DataBaseAvatar(var context: Context): SQLiteOpenHelper(context, DATABASE_NAME_, null, DATABASE_VERSION_){
    override fun onCreate(db: SQLiteDatabase?) {
        var createTable = "CREATE TABLE " + TABLENAME_ + " (" +
                COL_ID_AVATAR + " VARCHAR(200) NOT NULL," +
                COL_NAME_AVATAR + " VARCHAR(30) NOT NULL)"

        db?.execSQL(createTable)
    }


    //aggiorna i dati

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS " + TABLENAME_)
        onCreate(db)
    }
    // inserisce i dati dentro al database

    fun insertData(avatar: Avatar) {
        val database = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COL_ID_AVATAR,avatar.code)
        contentValues.put(COL_NAME_AVATAR, avatar.nameAvatar)
        val result = database.insert(TABLENAME_, null, contentValues)
        if (result == (0).toLong()) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }
    }

    //legge i dati dentro al database

    fun readData(): MutableList<Avatar> {
        val list: MutableList<Avatar> = ArrayList()
        val db = this.readableDatabase
        val query = "Select * from $TABLENAME_"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            do {
                val avatar = Avatar()
                avatar.code = result.getString(result.getColumnIndex(COL_ID_AVATAR))
                avatar.nameAvatar = result.getString(result.getColumnIndex(COL_NAME_AVATAR))
                list.add(avatar)
            } while (result.moveToNext())
        }
        return list
    }

    /*fun updateData(){
        val db = this.writableDatabase
        val query = "Select * from "+ TABLENAME_
        val result = db.rawQuery(query,null)

        if(result.moveToFirst()) {
            do {
                var cv = ContentValues()
                cv.put(,result.getInt(result.getColumnIndex(COL_)))
                db.update(TABLENAME_)
            }while(result.moveToNext())
        }
    }*/

}

