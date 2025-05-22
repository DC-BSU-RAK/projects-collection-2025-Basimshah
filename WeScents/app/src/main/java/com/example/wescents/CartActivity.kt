package com.example.wescents

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val cartTextView = findViewById<TextView>(R.id.cartTextView)
        val prefs = getSharedPreferences("cart", Context.MODE_PRIVATE)
        val cartItems = StringBuilder()

        val perfumes = listOf("dior", "ck", "jeanpaul", "shalimar")

        for (key in perfumes) {
            prefs.getString(key, null)?.let {
                cartItems.append("- $it\n")
            }
        }

        cartTextView.text = if (cartItems.isEmpty()) {
            "Your cart is empty."
        } else {
            "Items in your cart:\n\n$cartItems"
        }
    }
}
