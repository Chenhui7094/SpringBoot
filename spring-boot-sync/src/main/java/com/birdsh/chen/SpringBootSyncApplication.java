package com.birdsh.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync //  为了让@Async注解能够生效
public class SpringBootSyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSyncApplication.class, args);
	}
}
