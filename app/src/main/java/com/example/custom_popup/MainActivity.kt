package com.example.custom_popup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.popup.showpopup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener({
            showpopup.Popupmsg(this)
        })
        

    }
}