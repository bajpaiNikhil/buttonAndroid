package com.example.androidutiliity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton = findViewById<Button>(R.id.click_me)

        clickButton.setOnClickListener {

            Toast.makeText(this, "Button CLicked ", Toast.LENGTH_SHORT).show()
        }

    }
}