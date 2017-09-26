package com.birdsh.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.birdsh.chen.properties.CompanyProperties2;

@SpringBootApplication
public class SpringBootHello4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHello4Application.class, args);
	}
	
	@Bean
    @ConfigurationProperties(prefix = "com.birdsh.company")
    public CompanyProperties2 companyProperties2(){

       return new CompanyProperties2();

    }
}
