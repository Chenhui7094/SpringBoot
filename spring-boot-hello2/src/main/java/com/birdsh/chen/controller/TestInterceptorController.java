package com.birdsh.chen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName: TestInterceptorController.java 
 * @Description:为了测试拦截器编写的controller
 * @author chenhuihui
 * @time 2017年9月20日下午3:14:28
 */
@RestController
public class TestInterceptorController {
	@RequestMapping("/test")
	public String test(){
		return "hello!";
	}
}
