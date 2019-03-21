package com.rongzhi.Runner;
/**
 * 
 * 【类或接口功能描述】
 * @author guobao
 * @date 2018年2月12日 上午9:28:38 
 * @version V1.0
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=2)
public class MyStartupRunner2 implements CommandLineRunner {
	private Logger log = LoggerFactory.getLogger(MyStartupRunner2.class);
    @Override
    public void run(String... args) throws Exception {
        log.info("[MyStartupRunner2.run] [>>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 11111111<<<<<<<<<<<<<]");
    }

}