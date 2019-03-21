package com.rongzhi.Runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 
 * 【类或接口功能描述】
 * @author guobao
 * @date 2018年2月12日 上午10:28:38 
 * @version V1.0
 */
@Component
@Order(value = 1)
public class MyStartupRunner3 implements CommandLineRunner {
	private Logger log = LoggerFactory.getLogger(MyStartupRunner3.class);

    @Override
    public void run(String... args) throws Exception {
        log.info("[MyStartupRunner2.run] [>>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 33333333333<<<<<<<<<<<<<]");
    }

}