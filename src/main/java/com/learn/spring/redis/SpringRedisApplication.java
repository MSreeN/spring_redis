package com.learn.spring.redis;

import com.learn.spring.redis.service.RedisService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@EnableCaching
@SpringBootApplication
public class SpringRedisApplication {

	@Autowired
	RedisService redisService;

	public static void main(String[] args) {
		SpringApplication.run(SpringRedisApplication.class, args);
	}

//	@PostConstruct
	public void init(){
		redisService.fibService(5);
	}

}
