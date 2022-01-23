package com.example.demoapp

import com.example.feature.cars.controller.MessageController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoAppApplication

fun main(args: Array<String>) {
    runApplication<DemoAppApplication>(*args)
}
