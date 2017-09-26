package com.birdsh.chen.service; 

/**
 * @ClassName: TestService.java 
 * @Description:动态注入的service. 注意：这里没有使用@Service和配置文件进行注入TestService。
 * @author chenhuihui
 * @time 2017年9月26日下午3:44:45
 */
public class TestService {  
    private String name;  
    public String getName() {  
       return name;  
    }  
    public void setName(String name) {  
       this.name = name;  
    }  
    public void print(){  
       System.out.println("动态载入bean,name="+name);  
    }  
} 