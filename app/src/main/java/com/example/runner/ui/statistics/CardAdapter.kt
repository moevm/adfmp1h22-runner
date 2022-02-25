package com.example.runner.ui.statistics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.runner.databinding.TrainingCardBinding


class CardAdapter(
    private val trainings: List<TrainingCard>,
    private val clickListener: TrainingClickListener
) : RecyclerView.Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = TrainingCardBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindPlan(trainings[position])
    }

    override fun getItemCount(): Int = trainings.size
}