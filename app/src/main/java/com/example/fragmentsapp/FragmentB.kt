package com.example.fragmentsapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentsapp.databinding.FragmentBBinding

class FragmentB : Fragment() {
    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment B Test", "OnCreateView()")
        _binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

//    TODO: Create onViewCreated() function to add navigation to fragment A
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment B Test", "OnViewCreated()")

        // Set up button click listener to navigate to Fragment A
        binding.buttonNavigateToA.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentA())
                .commit()
        }
}

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment B Test", "OnDestroyView()")

        _binding = null // Avoid memory leaks
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment B Test", "OnAttach()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment B Test", "OnDetach()")

    }
}
