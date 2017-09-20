package com.birdsh.chen.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 测试实体类.
 * 
 * @author chenhuihui
 * 
 */
//加入@Entity这个注解，Demo就会进行持久化了，在这里没有对@Table进行配置，请自行配置。
@Entity
public class Demo {
	//使用@JSONField(serialize=false),此字段就不返回了
//	@JSONField(serialize=false)
	//引入jpa时可以使用   @GeneratedValue表示生成策略
	@Id @GeneratedValue
	private long id;// 主键.
	private String name;// 测试名称.

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}