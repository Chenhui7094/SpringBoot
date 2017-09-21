package com.birdsh.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.birdsh.chen.servlet.MyServlet1;
import com.birdsh.chen.setting.Wisely2Settings;
import com.birdsh.chen.setting.WiselySettings;

/**
 * 大家也许会看到有些demo使用了3个注解： @Configuration；
 * 
 * @EnableAutoConfiguration
 * @ComponentScan 其实：@SpringBootApplication申明让spring boot自动给程序进行必要的配置，
 *                等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
 *                所以大家不要被一些文档误导了，让自己很迷茫了，希望本文章对您有所启发；
 * @author chenhuihui
 * @version v.0.1
 */
//在SpringBoot1.4之后@ConfigurationProperties(prefix = "wisely",locations = "classpath:wisely.properties")中
//的locations已经失效,所以不能再用EnableConfigurationProperties了
//@EnableConfigurationProperties({WiselySettings.class,Wisely2Settings.class})为了使用自定义的配置而加的注解
//@EnableConfigurationProperties({WiselySettings.class,Wisely2Settings.class})  
@SpringBootApplication
@ServletComponentScan//这个就是扫描相应的Servlet包，过滤器和监听器也使用,基于注解时使用，不使用注解时采用的是29-32行的
//@ComponentScan注解进行指定要扫描的包以及要扫描的类。
//也可以写成@ComponentScan(basePackages={"com.birdsh"})
//spring boot里，扫描的class对象是用注解@ComponentScan(未指定的情况下默认是main函数所在package)来指定的
//看看你的App类，是不是放的位置
@ComponentScan(basePackages={"com.birdsh.runner1","com.birdsh.runner2","com.birdsh.chen.runner"})
public class SpringBootHello2Application {

	/**
	 * 注册Servlet.不需要添加注解：@ServletComponentScan
	 * 
	 * @return
	 */
	@Bean
	public ServletRegistrationBean MyServlet1() {
		return new ServletRegistrationBean(new MyServlet1(), "/myServlet1/*");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHello2Application.class, args);
	}
}
