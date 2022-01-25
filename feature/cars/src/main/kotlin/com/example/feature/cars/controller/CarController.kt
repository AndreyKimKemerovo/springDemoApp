package com.example.feature.cars.controller

import com.example.feature.cars.dto.CarDto
import com.example.feature.cars.repository.CarService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/car")
class CarController(
    val service: CarService
) {

    @GetMapping
    fun getCarsList(): List<CarDto> = service.list()
}
