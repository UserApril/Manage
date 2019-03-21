/*********************************************************************/
/*  文件名    EurekaServerApplication.java                                */
/*  功能名   服务中心 Application                                            */
/*  Copyright 2018  国宝人寿. All Rights Reserved.                      */
/*********************************************************************/
package com.rongzhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * 【服务注册中心 Application】
 * @author guobao
 * @date 2018年2月12日 下午4:35:06 
 * @version V1.0
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        //启动容器
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
