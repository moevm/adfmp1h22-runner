package com.example.runner.ui.plan

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.runner.R
import com.example.runner.databinding.FragmentTrainingBinding
import kotlin.math.log


class TrainingFragment : Fragment() {
    private var _binding: FragmentTrainingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentTrainingBinding.inflate(inflater, container, false)

        binding.backButton.setOnClickListener { view?.findNavController()?.navigateUp() }

        val listView: ListView = binding.lvMain

        val adapter = ArrayAdapter(
            requireActivity().application.applicationContext,
            R.layout.training_list_item, getTrainings()
        )
        listView.adapter = adapter

        return binding.root
    }

    private fun getTrainings(): Array<String> {
        return arrayOf(
            "Трусцой 02:00 мин.", "Ходьба 02:00 мин.",
            "Трусцой 02:00 мин.", "Ходьба 01:00 мин.",
            "Трусцой 05:00 мин.", "Ходьба 02:00 мин.",
            "Трусцой 05:00 мин.", "Ходьба 02:00 мин.",
            "Трусцой 02:00 мин.", "Ходьба 01:00 мин.",
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
