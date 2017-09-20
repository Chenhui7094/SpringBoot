package com.birdsh.chen.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @ClassName: TemplateController.java 
 * @Description:测试thymeleaf模板
 * @author chenhuihui
 * @time 2017年9月20日下午1:44:19
 */
//为Controller类使用@RestController注解,Controller中的方法无法返回jsp页面
//配置的视图解析器InternalResourceViewResolver不起作用  只会返回字符串   
//@RestController
//1)返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行
//2)如果需要返回JSON，XML或自定义mediaType内容到页面显示，需要在对应的方法上加上@ResponseBody注解。
@Controller
public class TemplateController {

    /**
     * 返回html模板.
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){

       map.put("hello","from TemplateController.helloHtml！！！");

       return"/helloHtml";

    }
}
