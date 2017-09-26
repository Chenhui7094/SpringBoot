package com.birdsh.chen.properties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName: CompanyProperties2.java 
 * @Description:使用@Bean在启动类中注入
 * @author chenhuihui
 * @time 2017年9月26日下午2:09:24
 */
public class CompanyProperties2 {

	private String name;
	private String location;
	private String mobile;
	private int employCount;
	private List<String> employs = new ArrayList<String>();
	//对应：com.kfit.company.firstName = lin  
    private String firstName;  
	//对应：com.kfit.company.logo-path = d:/data/files/logo.png  
	private String logoPath;  
	//对应：com.kfit.company.COMPANY_FULLNAME = 北京知远科技公司  
	private String companyFullname;  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getEmployCount() {
		return employCount;
	}
	public void setEmployCount(int employCount) {
		this.employCount = employCount;
	}
	public List<String> getEmploys() {
		return employs;
	}
	public void setEmploys(List<String> employs) {
		this.employs = employs;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLogoPath() {
		return logoPath;
	}
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
	public String getCompanyFullname() {
		return companyFullname;
	}
	public void setCompanyFullname(String companyFullname) {
		this.companyFullname = companyFullname;
	}
	@Override
	public String toString() {
		return "CompanyProperties [name=" + name + ", location=" + location + ", mobile=" + mobile + ", employCount="
				+ employCount + ", employs=" + employs + ", firstName=" + firstName + ", logoPath=" + logoPath
				+ ", companyFullname=" + companyFullname + "]";
	}
}
