package com.birdsh.chen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birdsh.chen.properties.CompanyProperties;
import com.birdsh.chen.properties.CompanyProperties2;
@RestController
public class TestController {
	@Autowired  
	private CompanyProperties companyProperties;
	@Autowired  
	private CompanyProperties2 companyProperties2;
	
	@RequestMapping("/test1")
	public String test1(){
		String str = null;
		str ="公司的名称是:"+companyProperties.getName()+";";
		str =str+"公司的地址是:"+companyProperties.getLocation()+";";
		str =str+"公司的电话是:"+companyProperties.getMobile()+";";
		str =str+"公司的人数有:"+companyProperties.getEmployCount()+";";
		str =str+"公司的员工是:"+companyProperties.getEmploys()+";";
		str =str+"公司的小名是:"+companyProperties.getFirstName()+";";
		str =str+"公司的LOGO是:"+companyProperties.getLogoPath()+";";
		str =str+"公司的全称是:"+companyProperties.getCompanyFullname()+";";
		return str;
		
	}
	
	@RequestMapping("/test2")
	public String test2(){
		String str = null;
		str ="公司的名称是:"+companyProperties2.getName()+";";
		str =str+"公司的地址是:"+companyProperties2.getLocation()+";";
		str =str+"公司的电话是:"+companyProperties2.getMobile()+";";
		str =str+"公司的人数有:"+companyProperties2.getEmployCount()+";";
		str =str+"公司的员工是:"+companyProperties2.getEmploys()+";";
		str =str+"公司的小名是:"+companyProperties2.getFirstName()+";";
		str =str+"公司的LOGO是:"+companyProperties2.getLogoPath()+";";
		str =str+"公司的全称是:"+companyProperties2.getCompanyFullname()+";";
		return str;
		
	}

}
