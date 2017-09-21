package com.birdsh.chen.service;

import org.springframework.stereotype.Service;


/**
 * @ClassName: HelloService2.java 
 * @Description:把这个service放在App.java类可以扫描的包下
 * @author chenhuihui
 * @time 2017年9月21日下午4:01:56
 */
@Service
public class HelloService2 {
	/**
	 * 启动的时候观察控制台是否打印此信息;
	 */
	public HelloService2() {
		System.out.println("HelloService2.HelloService2()");
		System.out.println("HelloService2.HelloService2()");
		System.out.println("HelloService2.HelloService2()");
	}
}
