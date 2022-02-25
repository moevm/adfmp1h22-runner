package com.example.runner.ui.plan

var planCardList = mutableListOf<PlanCard>()

class PlanCard(
    var image: Int,
    var text: String,
    val id: Int? = planCardList.size
)