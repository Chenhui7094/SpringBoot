package com.birdsh.chen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birdsh.chen.bean.Demo;
import com.birdsh.chen.service.DemoService;

/**
 * @ClassName: DemoJpaController.java 
 * @Description:测试Jpa的controller
 * @author chenhuihui
 * @time 2017年9月20日上午10:47:55
 */
@RestController
@RequestMapping("/demo2")
public class DemoJpaController {
	@Autowired
	private DemoService demoService;

	/**
	 * 测试保存数据方法.
	 * 
	 * @return
	 */
	@RequestMapping("/save")
	public String save() {
		Demo demo = new Demo();
		demo.setName("Angle");
		demoService.save(demo);// 保存数据.
		return "ok.Demo2Controller.save";
	}
	
	@RequestMapping("/find")
	public Demo select(){
		
		return demoService.find(1);
		
	}
	
	@RequestMapping("/findAll")
	public List<Demo> selectAll(){
		
		return demoService.findAll();
	}
	
	//produces="text/plain;charset=UTF-8"保证返回值不乱码
	@RequestMapping(value="/delete",produces="text/plain;charset=UTF-8")
	public String delete(){
		demoService.delete(1);;
		return "删除成功";
	}
	
	@RequestMapping("/update")
	public Demo update(){
		Demo demo = demoService.find(1);
		demo.setName("zhangsan");
		return demoService.find(1);
		
	}

}