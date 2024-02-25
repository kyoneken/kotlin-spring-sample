/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.kentymyty.kotlinspringsample.gateways.database

import com.kentymyty.kotlinspringsample.gateways.database.UsersDynamicSqlSupport.Users
import com.kentymyty.kotlinspringsample.gateways.database.UsersDynamicSqlSupport.Users.createdOn
import com.kentymyty.kotlinspringsample.gateways.database.UsersDynamicSqlSupport.Users.email
import com.kentymyty.kotlinspringsample.gateways.database.UsersDynamicSqlSupport.Users.id
import com.kentymyty.kotlinspringsample.gateways.database.UsersDynamicSqlSupport.Users.lastLogin
import com.kentymyty.kotlinspringsample.gateways.database.UsersDynamicSqlSupport.Users.password
import com.kentymyty.kotlinspringsample.gateways.database.UsersDynamicSqlSupport.Users.username
import com.kentymyty.kotlinspringsample.gateways.database.UsersRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun UsersMapper.count(completer: CountCompleter) =
    countFrom(this::count, Users, completer)

fun UsersMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, Users, completer)

fun UsersMapper.deleteByPrimaryKey(id_: Long) =
    delete {
        where(id, isEqualTo(id_))
    }

fun UsersMapper.insert(record: UsersRecord) =
    insert(this::insert, record, Users) {
        map(id).toProperty("id")
        map(username).toProperty("username")
        map(password).toProperty("password")
        map(email).toProperty("email")
        map(createdOn).toProperty("createdOn")
        map(lastLogin).toProperty("lastLogin")
    }

fun UsersMapper.insertMultiple(records: Collection<UsersRecord>) =
    insertMultiple(this::insertMultiple, records, Users) {
        map(id).toProperty("id")
        map(username).toProperty("username")
        map(password).toProperty("password")
        map(email).toProperty("email")
        map(createdOn).toProperty("createdOn")
        map(lastLogin).toProperty("lastLogin")
    }

fun UsersMapper.insertMultiple(vararg records: UsersRecord) =
    insertMultiple(records.toList())

fun UsersMapper.insertSelective(record: UsersRecord) =
    insert(this::insert, record, Users) {
        map(id).toPropertyWhenPresent("id", record::id)
        map(username).toPropertyWhenPresent("username", record::username)
        map(password).toPropertyWhenPresent("password", record::password)
        map(email).toPropertyWhenPresent("email", record::email)
        map(createdOn).toPropertyWhenPresent("createdOn", record::createdOn)
        map(lastLogin).toPropertyWhenPresent("lastLogin", record::lastLogin)
    }

private val columnList = listOf(id, username, password, email, createdOn, lastLogin)

fun UsersMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, Users, completer)

fun UsersMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, Users, completer)

fun UsersMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, Users, completer)

fun UsersMapper.selectByPrimaryKey(id_: Long) =
    selectOne {
        where(id, isEqualTo(id_))
    }

fun UsersMapper.update(completer: UpdateCompleter) =
    update(this::update, Users, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: UsersRecord) =
    apply {
        set(id).equalTo(record::id)
        set(username).equalTo(record::username)
        set(password).equalTo(record::password)
        set(email).equalTo(record::email)
        set(createdOn).equalTo(record::createdOn)
        set(lastLogin).equalTo(record::lastLogin)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: UsersRecord) =
    apply {
        set(id).equalToWhenPresent(record::id)
        set(username).equalToWhenPresent(record::username)
        set(password).equalToWhenPresent(record::password)
        set(email).equalToWhenPresent(record::email)
        set(createdOn).equalToWhenPresent(record::createdOn)
        set(lastLogin).equalToWhenPresent(record::lastLogin)
    }

fun UsersMapper.updateByPrimaryKey(record: UsersRecord) =
    update {
        set(username).equalTo(record::username)
        set(password).equalTo(record::password)
        set(email).equalTo(record::email)
        set(createdOn).equalTo(record::createdOn)
        set(lastLogin).equalTo(record::lastLogin)
        where(id, isEqualTo(record::id))
    }

fun UsersMapper.updateByPrimaryKeySelective(record: UsersRecord) =
    update {
        set(username).equalToWhenPresent(record::username)
        set(password).equalToWhenPresent(record::password)
        set(email).equalToWhenPresent(record::email)
        set(createdOn).equalToWhenPresent(record::createdOn)
        set(lastLogin).equalToWhenPresent(record::lastLogin)
        where(id, isEqualTo(record::id))
    }