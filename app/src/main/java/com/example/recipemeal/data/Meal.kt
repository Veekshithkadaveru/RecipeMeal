package com.example.recipemeal.data

import com.google.gson.annotations.SerializedName

data class Meal(@SerializedName("meals") val meals: List<Meal>)
