package com.example.feature.cars.dto

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("car")
data class CarDto(
    @Id
    val id: Int,
    val model: String,
    val color: Color
)

enum class Color(val color: String) {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue")
}
