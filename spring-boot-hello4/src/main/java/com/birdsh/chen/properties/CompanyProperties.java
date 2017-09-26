package com.birdsh.chen.properties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**第一：我们使用了@ConfigurationProperties(prefix = "com.birdsh.company") 快速注入我们的属性，这里prefix是key的公共部分。
 * 第二：这里我们使用@Component 注解为spring 管理的类，那么在别的类才可以进行注入使用。
 * 第三：在之前的文章中我们并没有使用@Component进行注册为spring 容器中，而是使用了@EnableConfigurationProperties({WiselySettings.class})  这样的方式进行注入的。这两种方式都可以。
*/
@ConfigurationProperties(prefix = "com.birdsh.company")
@Component
public class CompanyProperties {

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
