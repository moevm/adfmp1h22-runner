package com.example.runner.ui.auth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.runner.MainActivity
import com.example.runner.databinding.FragmentAuth2Binding


class Auth2Fragment : Fragment() {
    private var _binding: FragmentAuth2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAuth2Binding.inflate(inflater, container, false)

        binding.doneButton.setOnClickListener {
            val i =
                Intent(requireActivity().application.applicationContext, MainActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(i)
            activity?.finish()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}