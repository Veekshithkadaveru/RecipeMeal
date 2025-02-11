package com.example.recipemeal.data

import com.google.gson.annotations.SerializedName

data class CategoriesResponse(
    @SerializedName("categories") val categories: List<Category>
)
