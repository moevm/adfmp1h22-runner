package com.example.runner.ui.statistics

var trainingCardList = mutableListOf<TrainingCard>()

class TrainingCard(
    var text: String,
    val id: Int? = trainingCardList.size
)