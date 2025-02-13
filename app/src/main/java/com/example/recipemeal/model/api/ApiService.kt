package com.example.recipemeal.model.api

import com.example.recipemeal.data.CategoriesResponse
import com.example.recipemeal.data.MealDetailsResponse
import com.example.recipemeal.data.MealsResponse
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse

    @GET("search.php")
    suspend fun searchMeals(@Query("s") query: String): MealsResponse

    @GET("lookup.php")
    suspend fun getMealById(@Query("i") id: String): MealDetailsResponse

    @GET("filter.php")
    suspend fun filterByCategory(@Query("c") category: String): MealsResponse
}