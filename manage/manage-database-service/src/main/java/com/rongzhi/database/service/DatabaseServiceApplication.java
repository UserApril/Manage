package com.rongzhi.database.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableFeignClients
@RequestMapping("/get")
public class DatabaseServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatabaseServiceApplication.class,args);
    }

    @Value("${name}")
    String name;

    @RequestMapping("/name")
    public String getName(){
        return name;
    }
}

