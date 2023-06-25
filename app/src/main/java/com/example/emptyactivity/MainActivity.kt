package com.example.emptyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<View>(R.id.next)
        button.setOnClickListener {
            // Create the intent
            val intent = Intent(this@MainActivity, NewActivity::class.java)

            // Start the new activity
            startActivity(intent)
        }


    }
}