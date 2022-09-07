package com.zhb.longurl.controller

import com.zhb.longurl.entity.Url
import com.zhb.longurl.service.UrlService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/url")
class UrlController {

    @Autowired
    lateinit var urlService: UrlService

    @PostMapping("/save")
    fun save(@RequestBody url: Url): Url{
        urlService.save(url)
        return url
    }

    @GetMapping("/list")
    fun list(): List<Url>{
        return urlService.list();
    }
}