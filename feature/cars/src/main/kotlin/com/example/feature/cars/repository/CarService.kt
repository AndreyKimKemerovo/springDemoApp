package com.example.feature.cars.repository

import com.example.feature.cars.dto.CarDto
import org.springframework.stereotype.Service

@Service
class CarService(val repository: ICarRepository) {
    fun list(): List<CarDto> = repository.findCars()
}
