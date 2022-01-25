import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(dependencyNotation = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.15.0")
    }
}

plugins {
    id("org.springframework.boot") version "2.6.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.10"
    kotlin("plugin.spring") version "1.6.10"
    kotlin("plugin.jpa") version "1.6.10"
}

allprojects {
    apply(plugin = "io.gitlab.arturbosch.detekt")

    group = "com.example"
    version = "1.0.0"

    tasks.withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }

    repositories {
        mavenCentral()
        jcenter()
        maven { url = uri("https://jitpack.io") }
    }

    configure<io.gitlab.arturbosch.detekt.extensions.DetektExtension> {
        config = files("$rootDir/configuration/kotlin-detekt/detekt.yml")
        reports {
            html {
                enabled = true
                destination = file("$rootDir/build/reports/detekt/${project.name}/detekt.html")
            }
        }
    }
}

subprojects {
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }

    apply {
        plugin("io.spring.dependency-management")
        plugin("org.springframework.boot")
    }
}