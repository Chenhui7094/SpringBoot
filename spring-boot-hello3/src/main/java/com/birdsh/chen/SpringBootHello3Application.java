package com.birdsh.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"com.birdsh"})
public class SpringBootHello3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHello3Application.class, args);
	}
}
