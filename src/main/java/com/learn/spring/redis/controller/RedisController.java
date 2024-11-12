package com.learn.spring.redis.controller;

import com.learn.spring.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fib")
public class RedisController {

    @Autowired
    RedisService redisService;


    @GetMapping("/{index}")
    public int fibController(@PathVariable int index){
        return redisService.fibService(index);
    }

    @GetMapping("/hello")
    public String simple(){
        return "hello";
    }
}
