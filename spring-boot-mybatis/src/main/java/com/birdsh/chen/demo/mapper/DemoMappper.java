package com.birdsh.chen.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.birdsh.chen.demo.bean.Demo;
import com.birdsh.chen.demo.bean.querybean.DemoQueryBean;

public interface DemoMappper {
	/**
	 * 根据姓名查询demo信息
	 * @return
	 */
	@Select("select id,name from demo where name like concat(concat('%',#{name}),'%')")
	public List<Demo> likeName(DemoQueryBean queryBean);
//	public List<Demo> likeName(String name);
	
	/**
	 * 根据id查询demo信息
	 * @param id
	 * @return
	 */
	@Select("select * from demo where id = #{id}")
    public Demo getById(long id);
	
	/**
	 * 根据id查询demo姓名
	 * @param id
	 * @return
	 */
	@Select("select name from demo where id = #{id}")
    public String getNameById(long id);

}
