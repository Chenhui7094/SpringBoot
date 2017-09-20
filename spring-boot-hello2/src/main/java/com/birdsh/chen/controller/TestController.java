package com.birdsh.chen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.birdsh.chen.setting.Wisely2Settings;
import com.birdsh.chen.setting.WiselySettings;

/**
 * @ClassName: TestController.java 
 * @Description:测试使用自定义的配置而编写的controller
 * @author chenhuihui
 * @time 2017年9月20日下午4:27:51
 */
@RestController
public class TestController {
	@Autowired
	WiselySettings wiselySettings;
	@Autowired
	Wisely2Settings wisely2Settings;

	@RequestMapping("/test1")  
    public String test(){  
       System.out.println(wiselySettings.getGender()+"---"+wiselySettings.getName());  
       System.out.println(wisely2Settings.getGender()+"==="+wisely2Settings.getGender());  
       return "ok";  
    }
}