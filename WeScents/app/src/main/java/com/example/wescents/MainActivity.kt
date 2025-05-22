package com.example.wescents

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Perfume card click listeners
        findViewById<LinearLayout>(R.id.btnDior).setOnClickListener {
            startActivity(Intent(this, DiorActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btnCK).setOnClickListener {
            startActivity(Intent(this, CKActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btnJeanPaul).setOnClickListener {
            startActivity(Intent(this, JeanPaulActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btnShalimar).setOnClickListener {
            startActivity(Intent(this, ShalimarActivity::class.java))
        }

        // Bottom Navigation setup
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.selectedItemId = R.id.nav_home

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Already on Home
                    true
                }
                R.id.nav_cart -> {
                    val intent = Intent(this, CartActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}
