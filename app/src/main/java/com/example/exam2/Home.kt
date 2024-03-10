package com.example.exam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var btn = findViewById<TextView>(R.id.startbtn1)
        btn.setOnClickListener {
            var intent = Intent(this, displayarriveles::class.java)
            startActivity(intent)
            finish()
        }
    }
}