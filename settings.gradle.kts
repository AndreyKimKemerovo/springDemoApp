pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        maven { // The google mirror is less flaky than mavenCentral()
            url = uri("https://maven-central.storage-download.googleapis.com/repos/central/data/")
        }
        maven { url = uri("https://plugins.gradle.org/m2/") }
        maven { url = uri("https://jitpack.io") }
    }

}


rootProject.name = "demoApp"

include("app", ":feature:cars")