package com.example.myapplication

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var spinner: Spinner
    private lateinit var resultText: TextView
    private lateinit var calculateBtn: Button
    private lateinit var infoBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        spinner = findViewById(R.id.moodSpinner)
        resultText = findViewById(R.id.resultText)
        calculateBtn = findViewById(R.id.calculateBtn)
        infoBtn = findViewById(R.id.infoBtn)

        // Set up spinner with mood options
        ArrayAdapter.createFromResource(
            this,
            R.array.mood_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        // When calculate button is clicked
        calculateBtn.setOnClickListener {
            val mood = spinner.selectedItem.toString()
            val musicGenre = suggestGenre(mood)
            resultText.text = "You might enjoy: $musicGenre"
        }

        // When info button is clicked
        infoBtn.setOnClickListener {
            showInfoDialog()
        }
    }

    // This is your creative, non-numerical calculator
    private fun suggestGenre(mood: String): String {
        return when (mood) {
            "Happy" -> "Pop or Dance"
            "Sad" -> "Lo-fi or Blues"
            "Energetic" -> "EDM or Rock"
            "Calm" -> "Ambient or Jazz"
            "Romantic" -> "R&B or Soul"
            "Angry" -> "Rap or Metal"
            else -> "Try something new!"
        }
    }

    // Modal dialog to explain how the app works
    private fun showInfoDialog() {
        val dialog = AlertDialog.Builder(this)
            .setTitle("How It Works")
            .setMessage("MoodMelody helps you pick music based on how you're feeling. Select a mood and tap the button to get a suggestion. Enjoy your vibe!")
            .setPositiveButton("OK", null)
            .create()
        dialog.show()
    }
}
