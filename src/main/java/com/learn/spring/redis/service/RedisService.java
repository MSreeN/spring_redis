package com.learn.spring.redis.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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
        String personName = (String) redisTemplate.opsForHash().get("names", "pone");
        redisTemplate.opsForHash().put("games", "gone", "cricket");
    }

    @Cacheable(key = "'fib'", value = "math")
    public int fibService(int num){
        if(num == 0 || num == 1) return num;
        return fibService(num - 1) + fibService(num - 2);
    }
}
