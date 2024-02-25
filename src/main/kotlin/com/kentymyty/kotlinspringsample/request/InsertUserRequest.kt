package com.kentymyty.kotlinspringsample.request

import org.apache.tomcat.util.descriptor.web.LoginConfig
import java.util.*

data class InsertUserRequest(
    val username: String,
    val password: String,
    val email: String,
)
