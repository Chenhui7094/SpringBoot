package com.birdsh.chen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.birdsh.chen.bean.Demo;
import com.birdsh.chen.dao.DemoRepository;

/**
 * 
 * 提供Demo服务类.测试jpa
 * @author chenhuihui
 */

@Service
public class DemoService {

	@Autowired
	private DemoRepository demoRepository;

	/**
	 * 添加一个demo
	 * @param demo
	 */
	@Transactional
	public void save(Demo demo) {
		demoRepository.save(demo);
	}
	
	/**
	 * 根据id查询一个demo
	 * @param id
	 * @return
	 */
	public Demo find(long id){
		
		return demoRepository.findOne(id);
	}
	
	/**
	 * 查询所有的demo
	 * @return
	 */
	public List<Demo> findAll(){
		
		return (List<Demo>) demoRepository.findAll();
	}
	
	/**
	 * 根据id删除一个demo
	 */
	public void delete(long id){
		
		demoRepository.delete(id);;
	}

}
