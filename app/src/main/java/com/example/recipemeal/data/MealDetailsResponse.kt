package com.example.recipemeal.data

import com.google.gson.annotations.SerializedName

data class MealDetailsResponse(@SerializedName("meals") val meals: List<MealDetail>)
