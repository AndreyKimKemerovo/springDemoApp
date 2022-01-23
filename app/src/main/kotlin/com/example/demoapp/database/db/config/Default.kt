package com.example.demoapp.database.db.config

import com.improve_future.harmonica.core.DbConfig
import com.improve_future.harmonica.core.Dbms

class Default : DbConfig({
    // TODO need import from config
    dbms = Dbms.PostgreSQL
    dbName = "db"
    host = "127.0.0.37"
    user = "user"
    password = "pass"
})
