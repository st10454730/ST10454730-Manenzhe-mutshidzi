package com.example.screensmart

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Display
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

private fun Any.isNotEmpty() {


    class DetailedViewActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_detailed_view)


            val dates = intent.getIntegerArrayListExtra("dates") ?: arrayListOf()

            val morningScreenTimes =
                intent.getIntegerArrayListExtra("morningScreenTimes") ?: arrayListOf()

            val afternoonScreenTimes =
                intent.getIntegerArrayListExtra("afternoonScreenTimes") ?: arrayListOf()

            val activityNotes = intent.getIntegerArrayListExtra("activityNotes") ?: arrayListOf()

            val detailsTextView = findViewById<TextView>(R.id.detailstextview)

            val averageScreenTimeTextView = findViewById<TextView>(R.id.averageScreenTimeTextView)

            val backButton = findViewById<Button>(R.id.backButton)

            var totalScreenTime = 0

            var display = ""

            for (i in dates.indices) {
                val dailyScreenTime = morningScreenTimes[i] + afternoonScreenTimes[i]

                totalScreenTime += dailyScreenTime

                display += "Date{dates[i]}, morningScreenTimes[i]} min,Afternoon:$ {afternoonScreenTimes[i]}min,notes: $ {activityNotes[i]} \n\n"
            }
            val averageScreenTime = if (dates.isNotEmpty())totalScreenTime /dates.size else

            detailsTextView.text = display

            averageScreenTimeTextView.text = "Average Screen Time :$ averageScreenTimes minutes / day"

            backButton.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)

                startActivity(intent)
            }
        }

    }

}







