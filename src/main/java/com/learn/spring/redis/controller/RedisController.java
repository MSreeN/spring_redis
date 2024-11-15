package com.learn.spring.redis.controller;

import com.learn.spring.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/{index}")
    public String cacheDelete(@PathVariable int index){
        return redisService.cacheEvict(index);
    }

    @GetMapping("/lv")
    public int luckyValue(){
        return redisService.luckyNumber();
    }
}
