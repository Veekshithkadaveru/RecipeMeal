package com.example.recipemeal.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.example.recipemeal.viewmodel.MealViewModel

@Composable
fun CategoriesScreen(viewModel: MealViewModel) {

    val categories by viewModel.categories.collectAsState()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFF8BBD0),
                        Color(0xFFE1BEE7)
                    )
                )
            )
    ) {
        items(categories) { category ->
            TODO("Create category items")
        }
    }
    LaunchedEffect(Unit) {
        viewModel.getCategories()
    }


}