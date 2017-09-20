package com.birdsh.chen.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.birdsh.chen.bean.Demo;
import com.birdsh.chen.dao.DemoDao;

/**
 * 
 * 提供Demo服务类.测试JdbcTemplate
 * @author chenhuihui
 */

@Service
public class DemoService2 {

	@Autowired
	private DemoDao demoDao;

	
	/**
	 * 根据id查询一个demo
	 * @param id
	 * @return
	 */
	public Demo getById(long id){

        //demoRepository.findOne(id);//在demoRepository可以直接使用findOne进行获取.

        return demoDao.getDemoById(id);

 }
}
