package com.birdsh.chen.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
/**
 * 在SpringBoot1.4之后@ConfigurationProperties(prefix = "wisely",locations = "classpath:wisely.properties")中的locations已经失效
 * 因此采用下面的方式
 */
@Component
@ConfigurationProperties(prefix = "wisely")  
@PropertySource("classpath:wisely.properties")
public class WiselySettings {

	private String name;

	private String gender;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}