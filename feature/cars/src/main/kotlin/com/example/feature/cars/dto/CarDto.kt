package com.example.feature.cars.dto

data class CarDto(
    val id: Int,
    val model: String,
    val color: Color
)

enum class Color(val color: String) {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue")
}