package com.birdsh.chen.config;

import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.ImportResource;

/**
 * ImportResouce有两种常用的引入方式：classpath和file
 * classpath路径：locations={"classpath:application-bean1.xml","classpath:application-bean2.xml"}
 * file路径： locations = {"file:d:/test/application-bean1.xml"};
 */
/**
 * @ClassName: ConfigClass.java 
 * @Description:使用这个配置类来引入resources下的application-bean.xml配置文件，使用@ImportResource注解
 * @author chenhuihui
 * @time 2017年9月21日下午4:16:46
 */
@Configuration
@ImportResource(locations = { "classpath:application-bean.xml" })
// @ImportResource(locations={"file:d:/test/application-bean1.xml"})
public class ConfigClass {
}
