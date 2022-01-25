package com.example.demoapp.database.db.migration

import com.improve_future.harmonica.core.AbstractMigration

/**
 * create_car_table
 */
class M20220124031118531_create_car_table : AbstractMigration() {
    override fun up() {
        createTable("car") {
            varchar("model", size = 10, nullable = false)
        }

        executeSql("CREATE TYPE car_color_enum AS ENUM ('RED', 'GREEN', 'BLUE');")
        executeSql("ALTER TABLE car ADD color car_color_enum;")

    }

    override fun down() {
        dropTable("car")
        executeSql("DROP TYPE IF EXISTS car_color_enum;")
    }
}
