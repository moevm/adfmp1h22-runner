package com.example.runner.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.runner.CardViewHolder
import com.example.runner.PlanCard
import com.example.runner.databinding.PlanCardBinding

class CardAdapter(
    private val plans: List<PlanCard>,
)
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder
    {
        val from = LayoutInflater.from(parent.context)
        val binding = PlanCardBinding.inflate(from, parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int)
    {
        holder.bindPlan(plans[position])
    }

    override fun getItemCount(): Int = plans.size
}