package com.kentymyty.kotlinspringsample

import com.kentymyty.kotlinspringsample.Di.Greeter
import com.kentymyty.kotlinspringsample.Di.MessageService
import com.kentymyty.kotlinspringsample.request.HelloRequest
import com.kentymyty.kotlinspringsample.response.HelloResponse
import org.apache.logging.log4j.message.Message
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("greeter")
class GreeterController(
    private val greeter: Greeter,
    @Qualifier("EnglishMessageService")
    private val messageService: MessageService
)
{

    @GetMapping("/hello")
    fun hello(@RequestParam("name") name: String): HelloResponse {
        return HelloResponse("Hello ${name}")
    }

    @GetMapping("/hello/{name}")
    fun helloPathValue(@PathVariable("name") name: String): HelloResponse {
        return HelloResponse("Hello ${name}")
    }

    @PostMapping("/hello")
    fun helloByPost(@RequestBody request: HelloRequest): HelloResponse {
        return HelloResponse("Hello ${request.name}")
    }

    @GetMapping("/hello/byservice/{name}")
    fun helloByService(@PathVariable("name") name: String): HelloResponse {
        val message = greeter.sayHello(name)
        return HelloResponse(message)
    }

    @GetMapping("/hello/qualifier")
    fun helloByQualifer(): HelloResponse {
        val message = messageService.sayHello()
        return HelloResponse(message)
    }
}