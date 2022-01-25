package com.example.feature.cars.repository

import com.example.feature.cars.dto.CarDto
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface ICarRepository : CrudRepository<CarDto, Int> {

    @Query("select * from car")
    fun findCars(): List<CarDto>
}

/*@Repository("com.example.feature.cars.repository.ICarRepository")
open class ICarRepository() {
    fun findCars(): List<CarDto> = listOf(
        CarDto(
            id = 1,
            model = "asd",
            color = Color.BLUE
        )
    )
}*/
