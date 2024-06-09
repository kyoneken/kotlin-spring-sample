/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.kentymyty.kotlinspringsample.gateways.database

import com.kentymyty.kotlinspringsample.gateways.database.UsersRecord
import org.apache.ibatis.annotations.DeleteProvider
import org.apache.ibatis.annotations.InsertProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.annotations.UpdateProvider
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter

@Mapper
interface UsersMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    fun insert(insertStatement: InsertStatementProvider<UsersRecord>): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insertMultiple")
    fun insertMultiple(multipleInsertStatement: MultiRowInsertStatementProvider<UsersRecord>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("UsersRecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): UsersRecord?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="UsersRecordResult", value = [
        Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        Result(column="created_on", property="createdOn", jdbcType=JdbcType.TIMESTAMP),
        Result(column="last_login", property="lastLogin", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<UsersRecord>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int
}