package com.birdsh.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.birdsh.chen.dynamic.DynamicDataSourceRegister;

@SpringBootApplication
//注册动态多数据源
@Import({DynamicDataSourceRegister.class})
public class SpringBootMultidsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultidsApplication.class, args);
	}
}
