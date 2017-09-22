package com.birdsh.chen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birdsh.chen.bean.DemoInfo;
import com.birdsh.chen.service.DemoInfoService;

@RestController
public class DemoInfoController {

	@Autowired
	private DemoInfoService demoInfoService;
	
	@RequestMapping("/test")  
	public String test(){
		DemoInfo loaded = demoInfoService.findById(1);
		System.out.println("demoInfo="+loaded);
		
		DemoInfo cached = demoInfoService.findById(1);
		System.out.println("cached="+cached);
		
		loaded = demoInfoService.findById(2);
		System.out.println("loaded2="+loaded);  
		
		return "ok"; 
	}
	
	@RequestMapping("/delete")  
    public String delete(long id){  
        demoInfoService.deleteFromCache(id);  
        return"ok";  
    }  
     
    @RequestMapping("/test1")  
    public String test1(){  
        demoInfoService.test();  
        System.out.println("DemoInfoController.test1()");  
        return "ok";  
    } 
}
