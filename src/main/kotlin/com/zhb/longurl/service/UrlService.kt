package com.zhb.longurl.service

import com.alibaba.fastjson.JSON
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.zhb.longurl.entity.Url
import com.zhb.longurl.mapper.UrlMapper
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service

@Slf4j
@Service
class UrlService : ServiceImpl<UrlMapper, Url>() {

    @Autowired
    lateinit var redisTemplate: RedisTemplate<String, Any>

    override fun save(url: Url): Boolean {
        var sourceUrl = url.sourceUrl
        val target: String = ""
        val urlCount = redisTemplate.opsForValue().get("url:count")
        if ("" == urlCount){
            redisTemplate.opsForValue().set("url:count",0)
        }



        url.targetUrl = target
        redisTemplate.opsForValue().set(target,url)

        return true
    }
}