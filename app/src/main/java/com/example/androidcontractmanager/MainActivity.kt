package com.example.androidcontractmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import android.content.Intent
import android.util.Log
import android.widget.Button
import com.example.androidcontractmanager.ui.theme.AndroidContractManagerTheme

class MainActivity : ComponentActivity() {

    // Tag for logging lifecycle events
    private val TAG = "MainActivity"

    // Called when the activity is first created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate") // Log lifecycle event

        // Enables drawing under system bars (status & navigation bars)
        enableEdgeToEdge()

        // Sets the UI layout for this activity from XML
        setContentView(R.layout.activity_main)

        // Find the "Click Me" button and set a click listener
        val clickMeButton = findViewById<Button>(R.id.button_click_me)
        clickMeButton.setOnClickListener {
            // Create an explicit intent to launch SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent) // Start the new activity
        }

        // Find the "Share" button and set a click listener
        val shareButton = findViewById<Button>(R.id.button_share)
        shareButton.setOnClickListener {
            // Create an implicit intent to share plain text
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "Welcome to our Application")
            }
            // Launch the chooser to select an app to share with
            startActivity(Intent.createChooser(intent, "Share via"))
        }
    }

    // Lifecycle method called when the activity becomes visible
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    // Lifecycle method called when the activity starts interacting with the user
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    // Lifecycle method called when the activity is partially obscured
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    // Lifecycle method called when the activity is no longer visible
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    // Lifecycle method called before the activity is destroyed
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}
