package com.example.recipemeal.data

import com.google.gson.annotations.SerializedName

data class MealsResponse(@SerializedName("meals") val meals: List<Meal>)
