package com.birdsh.chen.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String hello(String params1,String params2){

       return "hello,Andy,params1="+params1+",params1="+params2;

    }
    /**
     * 此方法执行的时候，会抛出异常：
     * Session creation has been disabled for the current subject.
     * @param session
     * @return
     */
    @RequestMapping("/hello3")
    public String hello3(){
       Subject currentUser = SecurityUtils.getSubject(); 
       Session session = currentUser.getSession();
       System.out.println(session);
       return"hello3,Andy";

    }
    
    @RequestMapping("/hello4")
    @RequiresRoles("admin")
 // @RequiresPermissions("userInfo:add")//权限管理;
    public String hello4(){
       return "hello4,Andy";
    }

}