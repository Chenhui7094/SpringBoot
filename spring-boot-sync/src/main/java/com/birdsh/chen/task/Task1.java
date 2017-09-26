package com.birdsh.chen.task;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @ClassName: Task1.java 
 * @Description:定义三个同步执行的任务
 * @author chenhuihui
 * @time 2017年9月26日上午11:08:19
 */
@Component
public class Task1 {
	private Logger logger =  LoggerFactory.getLogger(this.getClass());
	//定义一个随机对象.
	private static Random random = new Random();
	
	//任务一;
    public void doTaskOne() throws Exception {
    
    	logger.info("开始做任务一");
    	long start = System.currentTimeMillis();
    	Thread.sleep(random.nextInt(10000));
    	long end = System.currentTimeMillis();
    	System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
    }
	
    //任务二;

    public void doTaskTwo() throws Exception {
        System.out.println("开始做任务二");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");
    }

 

    //任务3;

    public void doTaskThree() throws Exception {
        System.out.println("开始做任务三");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");
    }

}
