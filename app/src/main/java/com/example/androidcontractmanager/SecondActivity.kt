package com.example.androidcontractmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.util.Log
import android.widget.Button

class SecondActivity : ComponentActivity() {

    // TAG used for logging lifecycle events
    private val TAG = "SecondActivity"

    // Called when the activity is first created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate") // Log creation of activity

        // Set the layout for this activity from XML resource
        setContentView(R.layout.second_activity)

        // Find the "Back" button by its ID in the layout
        val backButton = findViewById<Button>(R.id.button_back)

        // Set a click listener on the back button
        backButton.setOnClickListener {
            // Finish the current activity and return to the previous one
            finish()
        }
    }

    // Activity lifecycle logging (optional but useful for debugging)
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}
