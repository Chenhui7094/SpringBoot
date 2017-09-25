package com.birdsh.chen.controller;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birdsh.chen.dao.Shanhy;
import com.birdsh.hui.service.HelloService;
/**
 * @author chenhui
 * @version v.0.1
 */
@RestController
public class HelloController {
    @Resource(name = "shanhyA")
    private Shanhy shanhyA;

    @Autowired
    @Qualifier("shanhyB")
    private Shanhy shanhyB;

    @RequestMapping("/test")
    public String test(){
       shanhyA.display();
       shanhyB.display();
       return"test";
    }
}