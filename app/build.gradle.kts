plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

buildscript {

    dependencies {
        classpath("com.github.icerockdev:harmonica:00cca77aa65bff65e7995265c43dafd7db18cf67")
    }
}

apply {
    plugin("jarmonica")
}

//migrations
extensions.extraProperties["migrationPackage"] = "com.example.demoapp.database.db"
extensions.extraProperties["tableNamePluralization"] = true

dependencies {
    implementation(project(":feature:cars"))

    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    runtimeOnly("org.postgresql:postgresql")
    implementation("com.github.icerockdev:harmonica:00cca77aa65bff65e7995265c43dafd7db18cf67")

}

