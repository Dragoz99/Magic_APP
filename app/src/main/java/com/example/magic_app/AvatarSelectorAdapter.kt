package com.example.magic_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.drawToBitmap

class AvatarSelectorAdapter (private val context: Context, val data:  MutableList<Avatar>) : BaseAdapter() {
    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View?{
        var newView = convertView
        if(convertView == null)
            newView = LayoutInflater.from(context).inflate(R.layout.row, parent, false )
        if(newView != null){
            val avatarName = newView.findViewById<TextView>(R.id.textViewName)
            val imageAvatarView_ = newView.findViewById<ImageView>(R.id.imageViewAvatar)

            avatarName.text = data[position].nameAvatar
            imageAvatarView_.setImageResource(setAvatar(data[position].code)) // string-> int



        }

        return newView
    }


    fun setAvatar(codice: String): Int {
        var coso: Int =0
        when(codice){
            "AVATAR_SET_UP_GU" -> coso =  R.drawable.ic_avatar_oko_ug_background
            "AVATAR_SET_UP_U" -> coso = R.drawable.ic_avatar_jace_u_background
        }
        return coso
    }
}