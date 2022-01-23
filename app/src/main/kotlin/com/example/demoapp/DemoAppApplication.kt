package com.example.demoapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.feature.cars"])
class DemoAppApplication

fun main(args: Array<String>) {
    runApplication<DemoAppApplication>(*args)
}
