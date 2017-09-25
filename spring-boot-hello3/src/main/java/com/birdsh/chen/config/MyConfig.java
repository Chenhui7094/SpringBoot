package com.birdsh.chen.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.birdsh.chen.dao.Shanhy;
import com.birdsh.hui.service.HelloService;

@Configuration
public class MyConfig {
    /**
     *  这里只是测试使用，没有实际的意义.
     */
    @Bean(name="testHelloService")
    public HelloService filterRegistrationBean(@Qualifier("shanhyB") Shanhy shanhy){
       HelloService helloService = new HelloService();
       shanhy.display();
        // 其它处理代码.
        return helloService;
    }

}