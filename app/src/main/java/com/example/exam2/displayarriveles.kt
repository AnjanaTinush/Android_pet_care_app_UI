package com.example.exam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class displayarriveles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_displayarriveles)

        var btn1 = findViewById<TextView>(R.id.resevebtn1)
        btn1.setOnClickListener {
            var intent = Intent(this, Resivarion::class.java)
            startActivity(intent)
            finish()
        }
        var btn2 = findViewById<TextView>(R.id.resevebtn2)
        btn2.setOnClickListener {
            var intent = Intent(this, Resivarion::class.java)
            startActivity(intent)
            finish()
        }
        var btn3 = findViewById<TextView>(R.id.resevebtn3)
        btn3.setOnClickListener {
            var intent = Intent(this, Resivarion::class.java)
            startActivity(intent)
            finish()
        }
        var btn4 = findViewById<TextView>(R.id.resevebtn4)
        btn4.setOnClickListener {
            var intent = Intent(this, Resivarion::class.java)
            startActivity(intent)
            finish()
        }
        var btn5 = findViewById<TextView>(R.id.resevebtn5)
        btn5.setOnClickListener {
            var intent = Intent(this, Resivarion::class.java)
            startActivity(intent)
            finish()
        }
    }
}