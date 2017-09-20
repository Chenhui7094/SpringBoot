package com.birdsh.chen.controller;


import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birdsh.chen.bean.Demo;
import com.birdsh.chen.service.DemoService2;

/**
 * @ClassName: DemoJDBCController.java 
 * @Description:测试JdbcTemplate的controlller
 * @author chenhuihui
 * @time 2017年9月20日上午10:47:22
 */
@RestController
@RequestMapping("/demo3")
public class DemoJDBCController {
	@Autowired
	private DemoService2 demoService2;
	
	//http://192.168.33.181:8080/demo3/findId1/1
	//修改端口和路径之后http://192.168.33.181:8081/springboothello1/demo3/findId1/1
	@RequestMapping("/findId1/{id}")
	public Demo select1(@PathVariable("id") long id){
		
		return demoService2.getById(id);
	}
	
	//http://192.168.33.181:8080/demo3/findId2?id=1
	//修改端口和路径之后http://192.168.33.181:8081/springboothello1/demo3/findId2?id=1
	@RequestMapping("/findId2")
	public Demo select2(@PathParam("id") long id){
		
		return demoService2.getById(id);
	}

}