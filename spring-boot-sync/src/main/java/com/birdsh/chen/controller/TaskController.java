package com.birdsh.chen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birdsh.chen.task.Task1;
import com.birdsh.chen.task.Task2;

/**
 * @ClassName: TaskController.java 
 * @Description:测试同步执行的三个任务
 * @author chenhuihui
 * @time 2017年9月26日上午11:14:21
 */
@RestController
public class TaskController {
	@Autowired
	private Task1 task1;
	@Autowired
	private Task2 task2;
	@RequestMapping("/task1")
	public String task1() throws Exception{
		task1.doTaskOne();
		task1.doTaskTwo();
		task1.doTaskThree();
		return "task1";
	}
	
	@RequestMapping("/task2")
	public String task2() throws Exception{
		task2.doTaskOne();
		task2.doTaskTwo();
		task2.doTaskThree();
		return "task2";
	}
	

}
