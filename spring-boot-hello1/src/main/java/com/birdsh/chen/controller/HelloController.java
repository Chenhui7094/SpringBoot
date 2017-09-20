package com.birdsh.chen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController.java 
 * @Description:
 * @author chenhuihui
 * @time 2017年9月19日下午4:07:35
 */
/**
 * @RestController返回json字符串的数据，直接可以编写RESTFul的接口；
 */
@RestController
public class HelloController {
	@RequestMapping("/")
	public String hello() {
		return "Hello world!";
	}

}
