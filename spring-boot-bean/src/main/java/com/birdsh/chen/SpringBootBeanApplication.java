package com.birdsh.chen;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.birdsh.chen.service.TestService;

@SpringBootApplication
public class SpringBootBeanApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootBeanApplication.class, args);//默认的载入bean方式
		//获取context.  
		ApplicationContext ctx =  (ApplicationContext) SpringApplication.run(SpringBootBeanApplication.class, args);  
		        
		//获取BeanFactory  
		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) ctx.getAutowireCapableBeanFactory();  
		        
		//创建bean信息.  
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(TestService.class);  
		beanDefinitionBuilder.addPropertyValue("name","张三");  

		//动态注册bean.  
		defaultListableBeanFactory.registerBeanDefinition("testService", beanDefinitionBuilder.getBeanDefinition());  
		
		
//		多次注入同一个bean的，如果beanName不一样的话，那么会产生两个Bean；如果beanName一样的话，后面注入的会覆盖前面的。   
	    beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(TestService.class);  
	    beanDefinitionBuilder.addPropertyValue("name","李四");  
	  //动态注册bean.  
	  	defaultListableBeanFactory.registerBeanDefinition("testService1", beanDefinitionBuilder.getBeanDefinition());  
	  //删除bean.  
//	  	defaultListableBeanFactory.removeBeanDefinition("testService");  
		//获取动态注册的bean.  
//		TestService testService =ctx.getBean(TestService.class);
	  	//多次注入同一个bean的，如果beanName不一样的话，那么会产生两个Bean；这时需要下面的获取方式来获取bean
	    TestService testService =(TestService) ctx.getBean("testService");  
		testService.print();
	}
}
