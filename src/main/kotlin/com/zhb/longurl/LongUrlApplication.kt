package com.zhb.longurl

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan("com.zhb.longurl.mapper")
class LongUrlApplication

fun main(args: Array<String>) {
    runApplication<LongUrlApplication>(*args)
}
