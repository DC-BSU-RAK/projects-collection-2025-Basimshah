package com.example.wescents

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ShalimarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shalimar)

        findViewById<Button>(R.id.btnAddToCartShalimar).setOnClickListener {
            val prefs = getSharedPreferences("cart", Context.MODE_PRIVATE)
            prefs.edit().putString("shalimar", "Shalimar De Guerlain added to cart").apply()
            Toast.makeText(this, "Added Shalimar De Guerlain to Cart", Toast.LENGTH_SHORT).show()
        }
    }
}