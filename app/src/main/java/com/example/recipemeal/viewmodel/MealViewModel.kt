package com.example.recipemeal.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipemeal.repository.Repository
import com.example.recipemeal.data.Category
import com.example.recipemeal.data.Meal
import com.example.recipemeal.data.MealDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealViewModel @Inject constructor(private val mealRepository: Repository) : ViewModel() {

    private val _categories = MutableStateFlow<List<Category>>(emptyList())
    val categories: StateFlow<List<Category>> = _categories

    private val _meals = MutableStateFlow<List<Meal>>(emptyList())
    val meals: StateFlow<List<Meal>> = _meals

    private val _mealDetails = MutableStateFlow<MealDetail?>(null)
    val mealDetails: StateFlow<MealDetail?> = _mealDetails

    fun getCategories() {
        viewModelScope.launch {
            _categories.value = mealRepository.getCategories().categories
        }
    }

    fun searchMeals(query: String) {
        viewModelScope.launch {
            _meals.value = mealRepository.searchMeals(query).meals
        }
    }

    fun getMealsById(id: String) {
        viewModelScope.launch {
            _mealDetails.value = mealRepository.getMealById(id).meals.firstOrNull()
        }
    }

    fun filterByCategory(category: String) {
        viewModelScope.launch {
            _meals.value = mealRepository.filterByCategoryResponse(category).meals
        }
    }
}