package com.zhb.longurl.service

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.zhb.longurl.entity.Url
import com.zhb.longurl.mapper.UrlMapper
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service

@Slf4j
@Service
class UrlService : ServiceImpl<UrlMapper, Url>() {
}