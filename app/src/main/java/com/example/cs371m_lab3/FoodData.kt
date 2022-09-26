package com.example.cs371m_lab3

import androidx.annotation.DrawableRes

data class FoodData(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val quantity: String,
    val expiration_date: String
)
