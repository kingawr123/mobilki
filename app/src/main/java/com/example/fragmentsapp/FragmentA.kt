package com.example.fragmentsapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentsapp.databinding.FragmentABinding

class FragmentA : Fragment() {
    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Initialize binding
        Log.d("Fragment Test", "OnCreateView()")
        _binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment A Test", "OnViewCreated()")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment A Test", "OnDestroyView()")

        // Nullify binding to avoid memory leaks
        _binding = null
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment A Test", "OnAttach()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment A Test", "OnDetach()")

    }
}
