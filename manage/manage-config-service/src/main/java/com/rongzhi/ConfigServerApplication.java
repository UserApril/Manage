/*********************************************************************/
/**  文件名    ConfigServerApplication.java                               */
/**  功能名   配置中心 Application                                           */
/**  Copyright 2017  交银康联. All Rights Reserved.                     */
/*********************************************************************/

package com.rongzhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
 * 【配置中心 Application】
 * @author guobao
 * @date 2017年5月22日 下午4:35:06 
 * @version V1.0
 */

@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigServerApplication {

    public static void main(String[] args) {
        //启动配置中心容器
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
