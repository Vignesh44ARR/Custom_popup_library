package com.example.popup

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater

public class showpopup {
    companion object{
        fun Popupmsg(context: Context){
            var customLoginPopup = LayoutInflater.from(context).inflate(R.layout.activity_showpopup,null)
            var customLoginPopupBuilder = AlertDialog.Builder(context).setView(customLoginPopup)
            customLoginPopupBuilder.show()
        }
    }
}