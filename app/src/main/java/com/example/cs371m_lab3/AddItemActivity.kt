package com.example.cs371m_lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item)

        // Set listener to cancel button, result: go back to fridge layout without any changes
        val button = findViewById<Button>(R.id.button_cancel)
        button.setOnClickListener(){
            val intent = Intent(this, FridgeLayout::class.java)
            startActivity(intent)
        }


    }
}