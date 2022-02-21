package com.example.runner

var planCardList = mutableListOf<PlanCard>()


class PlanCard (
    var image: Int,
    var text: String,
    val id: Int? = planCardList.size
)