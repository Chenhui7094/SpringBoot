package com.birdsh.chen.task;

import java.util.Date;
import java.util.concurrent.ScheduledFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 思路：
 * 1、需要重新认识一个类ThreadPoolTaskScheduler，线程池任务调度类，能够开启线程池进行任务调度。
 * 2、ThreadPoolTaskScheduler.schedule()方法会创建一个定时计划ScheduledFuture，在这个方法需要添加两个参数，Runnable（线程接口类） 和CronTrigger（定时任务触发器）
 * 3、在ScheduledFuture中有一个cancel可以停止定时任务。
 * @ClassName: DynamicTask.java 
 * @Description:动态添加修改删除定时任务
 * @author chenhuihui
 * @time 2017年9月27日上午10:34:33
 */
@RestController
@Component
public class DynamicTask {
	
	@Autowired
	private ThreadPoolTaskScheduler threadPoolTaskScheduler;
//	future是treadPoolTaskScheduler执行方法schedule的返回值，主要用于定时任务的停止。
	private ScheduledFuture<?> future;
	
	@Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
       return new ThreadPoolTaskScheduler();
    }
	
//	编写启动定时器的方法startCron()；
	@RequestMapping("/startCron")
	public String startCron(){
		future = threadPoolTaskScheduler.schedule(new MyRunnable(), new CronTrigger("0/5 * * * * *"));
		System.out.println("DynamicTask.startCron()");
		return "startCron";
	}
	
//	编写停止方法stopCron(),这里编码的时候，需要注意下需要判断下future为null的时候，不然就很容易抛出NullPointerException；
	@RequestMapping("/stopCron")
    public String stopCron() {
		if(future != null){
			future.cancel(true);
		}
		System.out.println("DynamicTask.stopCron()");
		return "stopCron";
	}
	
//	编写修改定时任务执行周期方法changeCron10（），这里的原理就是关闭之前的定时器，创新在创建一个新的定时器。
	@RequestMapping("/changeCron10")
    public String startCron10() {
		stopCron();// 先停止，在开启.
		future= threadPoolTaskScheduler.schedule(new MyRunnable(), new CronTrigger("*/10 * * * * *"));
		System.out.println("DynamicTask.startCron10()");
	    return "changeCron10";
	}
	
	private class MyRunnable implements Runnable {
	       @Override
	       public void run() {
	           System.out.println("DynamicTask.MyRunnable.run()，" + new Date());
	       }
	    }

}
