package com.birdsh.chen.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;


@SpringBootApplication
@MapperScan(basePackages = { "com.birdsh.**.mapper"})
public class SpringBootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisApplication.class, args);
	}
	
	//使用fastjson时返回的格式是code data message  使用自带的返回的是code message data
		@Bean
		public HttpMessageConverters fastJsonHttpMessageConverters() {
			FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
			FastJsonConfig fastJsonConfig = new FastJsonConfig();
			fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
			converter.setFastJsonConfig(fastJsonConfig);
			return new HttpMessageConverters(converter);
		}
		
}
