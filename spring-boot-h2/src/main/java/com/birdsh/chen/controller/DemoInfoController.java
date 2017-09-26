package com.birdsh.chen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birdsh.chen.bean.DemoInfo;
import com.birdsh.chen.repository.DemoInfoRepository;

/**
 * @ClassName: DemoInfoController.java 
 * @Description:
 * @author chenhuihui
 * @time 2017年9月26日下午3:03:35
 */
@RestController
public class DemoInfoController {

	@Autowired
	private DemoInfoRepository demoInfoRepository;
	/**
	 * 保存数据到h2内存数据库
	 * @return
	 */
	@RequestMapping("/save")
    public String save(){
		demoInfoRepository.save(new DemoInfo("title1","content1"));
		
	    demoInfoRepository.save(new DemoInfo("title2", "content2")); 

        demoInfoRepository.save(new DemoInfo("title3", "content3")); 

        demoInfoRepository.save(new DemoInfo("title4", "content4")); 

        demoInfoRepository.save(new DemoInfo("title5", "content5"));  
        
        return "save ok !";
	}
	
	/**
	 * 获取所有数据.
	 * @return
	 */
	 @RequestMapping("/findAll")
     public Iterable<DemoInfo> findAll(){
		 return demoInfoRepository.findAll(); 
	 }
}
