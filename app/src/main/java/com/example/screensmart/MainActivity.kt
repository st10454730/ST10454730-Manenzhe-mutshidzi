package com.example.screensmart

import android.annotation.SuppressLint
import android.graphics.Insets.add
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {

    private val dates = ArrayList<String>()

    private val morningScreenTime= ArrayList<String>()

    private val afternoonScreenTime = ArrayList<String>()

    private val activityNotes = ArrayList<String>()


    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.id.activity_main)


        val dateTextView = findViewById<TextView>(R.id.dateTextView)


        val morningScreenTimeTextView = findViewById<TextView>(R.id.morningScreenTimeTextView)

        val afternoonScreenTimeTextView = findViewById<TextView>(R.id.afternoonScreenTimeTextView)

        val activityNotesTextView = findViewById<TextView>(R.id.ActivityNotesTextView)

        val addButton = findViewById<Button>(R.id.addButton)

        val clearButton = findViewById<Button>(R.id.clearButton)

        val viewDetailsButton = findViewById<Button>(R.id.viewDetailsButton)


        addButton.setOnClickListener { }
        val date = dateTextView.text.toString()

        val morningScreenTimes = morningScreenTimeTextView.text.toString()

        val afternoonScreenTime = afternoonScreenTimeTextView.text.toString()

        val activityNotes = activityNotesTextView.text.toString()

        if (date.isNotEmpty() && morningScreenTimes != null && afternoonScreenTime != null && activityNotes.isNotEmpty()) {

            dates.add(date)
            morningScreenTime.add(morningScreenTimes)


            Toast.makeText(this, "Date Added", Toast.LENGTH_SHORT).show()

        } else {
            Toast.makeText(this, "please fill in all fields", Toast.LENGTH_SHORT).show()
        }
    }
    //The code that is commented out below will clear all data saved in the arraylists!
        

        //dates.clear()
        //morningScreenTimes.clear()
        //afternoonScreenTimes.clear()
        //activityNotes.clear()
        //Toast.makeText(this,"Data Cleared",Toast.LENGTH_SHORT).show()
            }
