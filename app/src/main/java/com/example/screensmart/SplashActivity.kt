package com.example.screensmart

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    @SuppressLint("IntentWithNullActionLaunch")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

           val startButton = findViewById<Button>(R.id.StartButton)
            val exitButton = findViewById<Button>(R.id.exitButton)

            startButton.setOnClickListener {

                Intent(this, MainActivity::class.java)

                startActivity(intent)
            }
                exitButton.setOnClickListener {

                    finish()


        }
    }
}








