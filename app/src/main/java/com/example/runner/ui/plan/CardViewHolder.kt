package com.example.runner.ui.plan

import androidx.recyclerview.widget.RecyclerView
import com.example.runner.databinding.PlanCardBinding

class CardViewHolder(
    private val planCardBinding: PlanCardBinding,
    private val clickListener: PlanClickListener
) : RecyclerView.ViewHolder(planCardBinding.root)
{
    fun bindPlan(planCard: PlanCard)
    {
        planCardBinding.planImage.setImageResource(planCard.image)
        planCardBinding.planText.text = planCard.text

        planCardBinding.cardView.setOnClickListener{
            clickListener.onClick(planCard)
        }
    }
}