package com.example.assignment01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //declare
    private lateinit var searchButton: Button
    private lateinit var celebTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton:Button
    private lateinit var textView: TextView
    private lateinit var invalidText:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initialise
        searchButton= findViewById(R.id.searchButton);
        clearButton= findViewById(R.id.clearButton);
        ageInput= findViewById(R.id.ageInput);
        celebTextView = findViewById(R.id.celebTextView);
        textView= findViewById(R.id.TextView);
        invalidText= findViewById(R.id.invalidText)

        searchButton.setOnClickListener{
            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in 20 ..100) {
                val celebrityName = when (age) {
                    20 -> "You are the same age as Cameron Boyce 20"

                    22 -> "You are the same age as Aaliyah 22"
                    23 -> "You are the same age as Selena Quintanilla 23"
                    25 -> "You are the same age as Simone Battle 25"
                    26 -> "You are the same age as Sharon Tate"
                    27 -> "You are the same age as Anton Yelchin 27"
                    28 -> "You are the same age as Samantha Wienstein 28"
                    30 -> "You are the same age as Cheslie Kryst 30"
                    32 -> "You are the same age as Charlbi Dean 32"
                    36 -> "You are the same age as Princess Diana 36"
                    else -> null
                }

                val celebText =
                    if (celebrityName != null) "The celebrity's name is $celebrityName."
                    else "There is no Celebrity with the same age"
                celebTextView.text = celebText

            }else{ invalidText.text = "Invalid input. Please enter a valid age between 20 and 100"
                celebTextView.text = invalidText.text
            }
            clearButton.setOnClickListener {
                ageInput.setText("")
            }


        }
    }
}