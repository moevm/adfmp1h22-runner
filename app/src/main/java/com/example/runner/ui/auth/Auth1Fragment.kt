package com.example.runner.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.runner.R
import com.example.runner.databinding.FragmentAuth1Binding


class Auth1Fragment : Fragment() {
    private var _binding: FragmentAuth1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAuth1Binding.inflate(inflater, container, false)
        binding.manButton.setOnClickListener {
            view?.findNavController()
                ?.navigate(R.id.action_navigation_auth1_to_navigation_auth2)
        }
        binding.womanButton.setOnClickListener {
            view?.findNavController()
                ?.navigate(R.id.action_navigation_auth1_to_navigation_auth2)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}