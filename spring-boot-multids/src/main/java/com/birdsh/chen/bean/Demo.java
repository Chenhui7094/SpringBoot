package com.birdsh.chen.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * 测试demo类.
 * 
 * @author Angel(QQ:412887952)
 * 
 * @version v.0.1
 * 
 */

@Entity

public class Demo {

	@Id
	@GeneratedValue
	private long id;

	private String name;

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

	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + "]";
	}

}