package com.example.runner.ui.statistics

import androidx.recyclerview.widget.RecyclerView
import com.example.runner.databinding.TrainingCardBinding


class CardViewHolder(
    private val trainingCardBinding: TrainingCardBinding,
    private val clickListener: TrainingClickListener
) : RecyclerView.ViewHolder(trainingCardBinding.root) {
    fun bindPlan(trainingCard: TrainingCard) {
        trainingCardBinding.trainingTimeText.text = trainingCard.text

        trainingCardBinding.cardView.setOnClickListener {
            clickListener.onClick(trainingCard)
        }
    }
}