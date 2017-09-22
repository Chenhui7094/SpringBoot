package com.birdsh.chen.repository;  

import org.springframework.data.repository.CrudRepository;

import com.birdsh.chen.bean.DemoInfo;  


/** 
 * DemoInfo持久化类 
 * @author chenhui
 * @version v.0.1 
 */  
public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long> {  

}  