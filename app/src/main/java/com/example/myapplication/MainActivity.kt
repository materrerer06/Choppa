package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

var simpleTV= findViewById<TextView>(R.id.simpleTv)
        simpleTV.text = "Nie zostałem jeszcze klikniety"

        var simpleBtn = findViewById<Button>(R.id.simpleBtn)
        simpleBtn.setOnClickListener {
            simpleTV.text = "kliknieto"
        }
    }
}