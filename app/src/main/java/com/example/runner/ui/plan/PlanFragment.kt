package com.example.runner.ui.plan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.runner.PlanCard
import com.example.runner.R
import com.example.runner.databinding.FragmentPlanBinding
import com.example.runner.planCardList
import com.example.runner.ui.CardAdapter


class PlanFragment : Fragment() {

    private var _binding: FragmentPlanBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPlanBinding.inflate(inflater, container, false)

        populatePlans()

        binding.recyclerView.apply {
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
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}