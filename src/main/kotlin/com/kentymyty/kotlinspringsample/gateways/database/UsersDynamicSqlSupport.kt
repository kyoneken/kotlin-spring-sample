/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.kentymyty.kotlinspringsample.gateways.database

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.SqlTable

object UsersDynamicSqlSupport {
    object Users : SqlTable("users") {
        val id = column<Long>("id", JDBCType.BIGINT)

        val username = column<String>("username", JDBCType.VARCHAR)

        val password = column<String>("password", JDBCType.VARCHAR)

        val email = column<String>("email", JDBCType.VARCHAR)

        val createdOn = column<Date>("created_on", JDBCType.TIMESTAMP)

        val lastLogin = column<Date>("last_login", JDBCType.TIMESTAMP)
    }
}