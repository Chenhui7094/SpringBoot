package com.birdsh.chen.repository;

import org.springframework.data.repository.CrudRepository;

import com.birdsh.chen.bean.DemoInfo;

/**
 * @ClassName: DemoInfoRepository.java 
 * @Description:DemoInfo的持久类
 * @author chenhuihui
 * @time 2017年9月26日下午3:02:41
 */
public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long>{

   

}