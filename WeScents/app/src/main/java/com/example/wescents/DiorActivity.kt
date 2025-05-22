package com.example.wescents

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DiorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dior)

        val button = findViewById<Button>(R.id.btnAddToCartDior)
        button.setOnClickListener {
            val prefs = getSharedPreferences("cart", Context.MODE_PRIVATE)
            prefs.edit().putString("dior", "Dior Sauvage added to cart").apply()
            Toast.makeText(this, "Added Dior Sauvage to Cart", Toast.LENGTH_SHORT).show()
        }
    }
}