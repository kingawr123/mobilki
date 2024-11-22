package com.example.fragmentsapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Test", "OnCreate() function")
        setContentView(R.layout.activity_main)

        // Load Fragment A on create
        if (savedInstanceState == null) {
            navigateToFragment(FragmentA())
        }

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

    override fun onResume() {
        super.onResume()
        Log.d("Test", "OnResume() function")
    }
    override fun onPause() {
        super.onPause()
        Log.d("Test", "OnPause() function")
    }
    override fun onStart() {
        super.onStart()
        Log.d("Test", "OnStart() function")
    }
    override fun onStop() {
        super.onStop()
        Log.d("Test", "OnStop() function")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Test", "OnDestroy() function")
    }
}
