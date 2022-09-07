package com.zhb.longurl.entity

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.time.LocalDateTime

@TableName("url")
data class Url(
                @TableId(type = IdType.AUTO)
                var id : Long=0,
               var sourceUrl: String="",
               var targetUrl: String="",
               var content: String="",
               var createTime: LocalDateTime = LocalDateTime.now(),
               var expired: Long=0,
               var password: String="",
               var maxBrowse: Int=0,
               var status: Int=1

               )
