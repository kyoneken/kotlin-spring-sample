package com.kentymyty.kotlinspringsample.Di

import org.springframework.stereotype.Component

@Component("EnglishMessageService")
class EnglishMessageService: MessageService {
    override fun sayHello(): String {
        return "Taro"
    }
}