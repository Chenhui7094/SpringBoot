package com.birdsh.chen.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName: MyWebAppConfigurer.java
 * @Description:处理静态资源(自定义静态资源)
 * @author chenhuihui
 * @time 2017年9月20日上午11:19:38
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		//使用代码的方式自定义目录映射    并不影响Spring Boot的默认映射，可以同时使用
		//如果我们将/myres/* 修改为 /* 与默认的相同时，则会覆盖系统的配置，可以多次使用 addResourceLocations 添加目录，优先级先添加的高于后添加的。
		//其中 addResourceLocations 的参数是动参，可以这样写 addResourceLocations(“classpath:/img1/”, “classpath:/img2/”, “classpath:/img3/”);
		registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");
		
		// 可以直接使用addResourceLocations 指定磁盘绝对路径，同样可以配置多个位置，注意路径写法需要加上file:
		registry.addResourceHandler("/api_files/**").addResourceLocations("file:D:/data/api_files/");
		super.addResourceHandlers(registry);

	}
}
