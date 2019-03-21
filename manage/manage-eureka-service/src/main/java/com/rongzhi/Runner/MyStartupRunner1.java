package com.rongzhi.Runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 
 * 【类或接口功能描述】
 * @author guobao
 * @date 2018年2月12日 上午9:28:38 
 * @version V1.0
 */
@Component
public class MyStartupRunner1 implements CommandLineRunner {
	private Logger log = LoggerFactory.getLogger(MyStartupRunner1.class);
    @Override
    public void run(String... args) throws Exception {
        log.info("[MyStartupRunner1.run] [>>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<]");
    }

}