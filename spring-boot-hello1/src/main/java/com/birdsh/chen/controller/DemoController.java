package com.birdsh.chen.controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.birdsh.chen.bean.Demo;  
   
/** 
 * 测试SpringBoot返回json数据格式
 * @author chenhuihui 
 * 
 */  
@RestController  
@RequestMapping("/demo")  
public class DemoController {  
     
    /** 
     * 返回demo数据: 
     * 请求地址：http://127.0.0.1:8080/demo/getDemo 
     * @return 
     */  
    @RequestMapping("/getDemo")  
    public Demo getDemo(){  
       Demo demo = new Demo();  
       demo.setId(1);  
       demo.setName("Angel");  
       return demo;  
    }  
    
    /**
     * 测试全局异常捕捉，会在控制台打印异常信息
     * @return
     */
    @RequestMapping("/zeroException")
    public int zeroException(){

       return 100/0;

    }
     
}  