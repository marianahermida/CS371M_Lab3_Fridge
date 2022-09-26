package com.example.cs371m_lab3

object DataSource {

    val foods: MutableList<FoodData> = mutableListOf(
        FoodData(
            R.drawable.dairy,
            "Dairy",
            "2",
            "10/8"
        ),
        FoodData(
            R.drawable.fruits,
            "Fruit",
            "1",
            "10/8"
        ),
        FoodData(
            R.drawable.proteins,
            "Meat",
            "2",
            "10/8"
        ),
        FoodData(
            R.drawable.vegetable,
            "Vegetable",
            "2",
            "10/8"
        ),
    )
}