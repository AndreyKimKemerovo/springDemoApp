package com.example.feature.cars.controller

import com.example.feature.cars.dto.CarDto
import com.example.feature.cars.dto.Color
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CarController {

    @GetMapping("/cars")
    fun getCarsList(): List<CarDto> {
        return listOf(
            CarDto(
                id = 1,
                model = "BMW",
                color = Color.RED
            ),
            CarDto(
                id = 2,
                model = "AUDI",
                color = Color.BLUE
            )
        )
    }
}
