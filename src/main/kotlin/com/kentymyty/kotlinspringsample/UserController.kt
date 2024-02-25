package com.kentymyty.kotlinspringsample

import com.kentymyty.kotlinspringsample.gateways.database.UsersMapper
import com.kentymyty.kotlinspringsample.gateways.database.UsersRecord
import com.kentymyty.kotlinspringsample.gateways.database.insert
import com.kentymyty.kotlinspringsample.gateways.database.selectByPrimaryKey
import com.kentymyty.kotlinspringsample.request.InsertUserRequest
import com.kentymyty.kotlinspringsample.response.HelloResponse
import com.kentymyty.kotlinspringsample.response.InsertUserResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("user")
class UserController (private val usersMapper: UsersMapper) {
    @GetMapping("/{id}")
    fun select(@PathVariable("id") id: Long): UsersRecord? {
        return usersMapper.selectByPrimaryKey(id)
    }

    @PostMapping("/")
    fun insert(@RequestBody request: InsertUserRequest): InsertUserResponse {
        val record = UsersRecord(
            username = request.username,
            password = request.password,
            email = request.email,
            createdOn = Date(),
        )
        return InsertUserResponse(usersMapper.insert(record))
    }
}
