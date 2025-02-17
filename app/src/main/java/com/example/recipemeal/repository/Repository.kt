package com.example.recipemeal.repository

import com.example.recipemeal.data.CategoriesResponse
import com.example.recipemeal.data.MealDetailsResponse
import com.example.recipemeal.data.MealsResponse
import com.example.recipemeal.model.api.ApiService
import javax.inject.Inject

class Repository @Inject constructor(private val apiService:ApiService) {

    suspend fun getCategories():CategoriesResponse{
       return apiService.getCategories()
    }

    suspend fun searchMeals(query:String): MealsResponse {
        return apiService.searchMeals(query )
    }

    suspend fun getMealById(id:String):MealDetailsResponse{
        return apiService.getMealById(id)
    }

    suspend fun filterByCategoryResponse(category:String):MealsResponse{
        return apiService.filterByCategory(category)
    }

}