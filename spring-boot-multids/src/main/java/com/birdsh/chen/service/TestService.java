package com.birdsh.chen.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.birdsh.chen.bean.Demo;
import com.birdsh.chen.dao.TestDao;
import com.birdsh.chen.dynamic.TargetDataSource;


@Service
public class TestService {
    @Resource
    private TestDao testDao;
   
    /**
     * 不指定数据源使用默认数据源
     * @return
     */
    public List<Demo> getList(){
       return testDao.getList();
    }
    /**
     * 指定数据源
     * @return
     */
    @TargetDataSource("ds1")
    public List<Demo> getListByDs1(){
        return testDao.getListByDs1();
    }
}