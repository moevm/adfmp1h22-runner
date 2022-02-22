package com.example.runner.ui.plan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.runner.R
import com.example.runner.databinding.FragmentPlanBinding


class PlanFragment : Fragment() {
    private var _binding: FragmentPlanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPlanBinding.inflate(inflater, container, false)

        planCardList.clear()
        populatePlans()

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(requireActivity().application.applicationContext, 1)
            adapter = CardAdapter(planCardList)
        }

        return binding.root
    }

    private fun populatePlans() {
        val plan1 = PlanCard(
            R.drawable.scales,
            "Бег для похудения"
        )
        planCardList.add(plan1)

        val plan2 = PlanCard(
            R.drawable.pace,
            "Работа над темпом"
        )
        planCardList.add(plan2)

        val plan3 = PlanCard(
            R.drawable.stamina,
            "Развитие выносливости"
        )
        planCardList.add(plan3)

        val plan4 = PlanCard(
            R.drawable.bike,
            "Веломарафон"
        )
        planCardList.add(plan4)

        val plan5 = PlanCard(
            R.drawable.start,
            "Мои первые 10 километров"
        )
        planCardList.add(plan5)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}