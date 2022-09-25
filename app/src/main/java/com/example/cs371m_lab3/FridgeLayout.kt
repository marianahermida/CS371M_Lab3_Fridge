package com.example.cs371m_lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FridgeLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fridge_layout)

        // Set listener to know if we need to move to the add item activity
        val button = findViewById<Button>(R.id.add_item_button)
        button.setOnClickListener(){
            val intent = Intent(this, AddItemActivity::class.java)
            startActivity(intent)
        }
    }
}