//package com.birdsh.chen.task;
//
//import java.util.Date;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//
///**
// * @ClassName: MyTask.java 
// * @Description:定时任务调度类
// * @author chenhuihui
// * @time 2017年9月26日下午5:26:19
// */
//@Configuration
//@EnableScheduling
//public class MyTask {
//	/**
//     * 我们希望这个方法每10秒打印一次.
//     * cron: 定时任务表达式.
//     *
//     * 指定：秒，分钟，小时，日期，月份，星期，年（可选）.
//     * *：任意.
//     */
//    @Scheduled(cron="0/10 * * * * *")
//  //@Scheduled(cron="0/10 * * * * ?")
//	public void task1(){
//		 System.out.println("MyTask.task1(),"+new Date());
//	}
//    /**
//     * 我们希望这个方法每1分钟打印一次.
//     */
//    @Scheduled(cron="0 0/1 * * * *")
//    public void task2(){
//       System.out.println("MyTask.task2(),"+new Date());
//    }
//}
