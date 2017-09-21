package com.birdsh.hui.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName: HelloService.java 
 * @Description: 注意这个类是写在Spring Boot无法自动扫描的位置,因此在启动的时候控制台是不会输出下面的结果的，
 * 在hello2中我们是通过@ComponentScan(basePackages={"com.birdsh"})来实现的。
 * @author chenhuihui
 * @time 2017年9月21日下午4:04:18
 */
@Service
public class HelloService {
	/**
	 * 启动的时候观察控制台是否打印此信息;
	 */
	public HelloService() {
		System.out.println("HelloService.HelloService()");

		System.out.println("com.birdsh.hui.service.HelloService.HelloService()");

		System.out.println("HelloService.HelloService()");

	}
}
