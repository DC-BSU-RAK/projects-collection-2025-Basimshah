package com.example.wescents

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CKActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ck)

        findViewById<Button>(R.id.btnAddToCartCK).setOnClickListener {
            val prefs = getSharedPreferences("cart", Context.MODE_PRIVATE)
            prefs.edit().putString("ck", "Calvin Klein One Shock added to cart").apply()
            Toast.makeText(this, "Added Calvin Klein One Shock to Cart", Toast.LENGTH_SHORT).show()
        }
    }
}