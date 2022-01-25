package com.example.demoapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories

@SpringBootApplication(scanBasePackages = ["com"])
@EnableJdbcRepositories(basePackages = ["com"])
class DemoAppApplication

@Suppress("SpreadOperator")
fun main(args: Array<String>) {
    runApplication<DemoAppApplication>(*args)
}
