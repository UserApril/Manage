package com.rongzhi.redis.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableTransactionManagement
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RedisServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedisServiceApplication.class,args);
    }
}
