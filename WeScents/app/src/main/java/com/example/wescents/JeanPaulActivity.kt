package com.example.wescents

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class JeanPaulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jeanpaul)

        findViewById<Button>(R.id.btnAddToCartJeanPaul).setOnClickListener {
            val prefs = getSharedPreferences("cart", Context.MODE_PRIVATE)
            prefs.edit().putString("jeanpaul", "Jean Paul Gaultier added to cart").apply()
            Toast.makeText(this, "Added Jean Paul Gaultier to Cart", Toast.LENGTH_SHORT).show()
        }
    }
}