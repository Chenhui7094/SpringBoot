package com.birdsh.chen.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birdsh.chen.demo.bean.Demo;
import com.birdsh.chen.demo.bean.PageBean;
import com.birdsh.chen.demo.bean.querybean.DemoQueryBean;
import com.birdsh.chen.demo.model.DataModel;
import com.birdsh.chen.demo.service.DemoService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
public class DemoController {
	@Autowired
	private DemoService demoService;

	@ApiOperation(value = "根据姓名查询demo", notes = "根据姓名查询demo")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "name", value = "Demo姓名", dataType = "String", paramType = "query", required = true) })
	@PostMapping("/likeName")
	public DataModel<PageBean<Demo>> likeName(DemoQueryBean queryBean) {
		System.out.println("为了测试Aop日志的before和after方法------>");
		return demoService.likeName(queryBean);
	}
}
