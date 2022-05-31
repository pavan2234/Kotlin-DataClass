package com.example.plugins

import me.liuwj.ktorm.database.Database

object Database {
   val Driver ="com.mysql.cj.jdbc.Driver"
    val url ="jdbc:mysql://localhost:3306/student"
    val username="root"
    val password="root"
    val database = Database.connect (url, Driver,username, password)


}