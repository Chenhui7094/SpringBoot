package com.birdsh.chen.service;

import com.birdsh.chen.bean.DemoInfo;

/** 
 * demoInfo 服务接口 
 * @author chenhui
 * @version v.0.1 
 */  
public interface DemoInfoService {  
    /**
     * 根据id查询demoinfo信息
     * @param id
     * @return
     */
    public DemoInfo findById(long id);  
     
    /**
     * 根据id从缓存中删除demoinfo信息
     * @param id
     */
    public void deleteFromCache(long id);  

    void test();  
}  