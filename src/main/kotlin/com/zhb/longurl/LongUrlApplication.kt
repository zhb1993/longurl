package com.zhb.longurl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LongUrlApplication

fun main(args: Array<String>) {
    runApplication<LongUrlApplication>(*args)
}
