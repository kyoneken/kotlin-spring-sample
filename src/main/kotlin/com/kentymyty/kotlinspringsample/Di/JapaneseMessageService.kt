package com.kentymyty.kotlinspringsample.Di

import org.springframework.stereotype.Component

@Component("JapaneseMessageService")
class JapaneseMessageService: MessageService {
    override fun sayHello(): String {
        return "太郎"
    }
}