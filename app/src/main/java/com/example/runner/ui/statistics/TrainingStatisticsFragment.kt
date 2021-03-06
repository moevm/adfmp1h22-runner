package com.example.runner.ui.statistics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.runner.R
import com.example.runner.databinding.FragmentTrainingStatisticsBinding


class TrainingStatisticsFragment : Fragment(), TrainingClickListener {
    private var _binding: FragmentTrainingStatisticsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTrainingStatisticsBinding.inflate(inflater, container, false)

        trainingCardList.clear()
        populateTrainings()

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(requireActivity().application.applicationContext, 1)
            adapter = CardAdapter(trainingCardList, this@TrainingStatisticsFragment)
        }

        binding.backButton.setOnClickListener {
            this.findNavController().navigateUp()
        }

        return binding.root
    }


    override fun onClick(trainingCard: TrainingCard) {
        view?.findNavController()
            ?.navigate(R.id.action_navigation_training_statistics_to_navigation_training_details)
    }

    private fun populateTrainings() {
        val training1 = TrainingCard(
            "15.02.2022 в 15:10"
        )
        trainingCardList.add(training1)

        val training2 = TrainingCard(
            "15.02.2022 в 15:20"
        )
        trainingCardList.add(training2)

        val training3 = TrainingCard(
            "15.02.2022 в 15:30"
        )
        trainingCardList.add(training3)

        val training4 = TrainingCard(
            "15.02.2022 в 15:40"
        )
        trainingCardList.add(training4)

        val training5 = TrainingCard(
            "15.02.2022 в 15:50"
        )
        trainingCardList.add(training5)

        val training6 = TrainingCard(
            "16.02.2022 в 16:00"
        )
        trainingCardList.add(training6)

        val training7 = TrainingCard(
            "16.02.2022 в 16:10"
        )
        trainingCardList.add(training7)

        trainingCardList.add(training1)
        trainingCardList.add(training2)
        trainingCardList.add(training3)
        trainingCardList.add(training4)
        trainingCardList.add(training5)
        trainingCardList.add(training6)
        trainingCardList.add(training7)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}