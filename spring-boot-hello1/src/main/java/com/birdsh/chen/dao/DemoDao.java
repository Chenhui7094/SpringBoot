package com.birdsh.chen.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.birdsh.chen.bean.Demo;


/**
 * @ClassName: DemoDao.java 
 * @Description:测试JdbcTemplate
 * @author chenhuihui
 * @time 2017年9月20日上午10:47:04
 */
@Component
public class DemoDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
     * 通过id获取demo对象.
     * @param id
     * @return
     */
	public Demo getDemoById(long id){
		String sql = "select * from demo where id = ?";
		//RowMapper可以将数据中的每一行数据封装成用户定义的类.
		RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);
		return jdbcTemplate.queryForObject(sql, rowMapper,id);
	}

}
