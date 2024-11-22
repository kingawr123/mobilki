package com.example.fragmentsapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragmentsapp.FragmentA
import com.example.fragmentsapp.FragmentB
import com.example.fragmentsapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Access buttons
        val buttonNavigateA: Button = findViewById(R.id.buttonNavigateA)
        val buttonNavigateB: Button = findViewById(R.id.buttonNavigateB)

        // Set click listeners
        buttonNavigateA.setOnClickListener {
            navigateToFragment(FragmentA())
        }

        buttonNavigateB.setOnClickListener {
            navigateToFragment(FragmentB())
        }
    }

    // Function to handle fragment navigation
    private fun navigateToFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}
