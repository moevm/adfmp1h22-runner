package com.example.runner

import androidx.recyclerview.widget.RecyclerView
import com.example.runner.databinding.PlanCardBinding

class CardViewHolder(
    private val planCardBinding: PlanCardBinding,
) : RecyclerView.ViewHolder(planCardBinding.root)
{
    fun bindPlan(planCard: PlanCard)
    {
        planCardBinding.planImage.setImageResource(planCard.image)
        planCardBinding.planText.text = planCard.text
    }
}