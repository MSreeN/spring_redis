package com.learn.spring.redis.config.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;


    @PostConstruct
    public void init(){
        redisTemplate.opsForValue().set("jane", "june");
        String name = (String) redisTemplate.opsForValue().get("name");
        int i = 0;
    }
}
