package com.birdsh.chen.entity;

import java.io.Serializable;

/**
 * @ClassName:
 * @Description:
 * @author chenhui
 * @date 2017年8月2日下午3:33:37
 */
public class Student implements Serializable{
	private static final long serialVersionUID = -3258839839160856613L;
	private int id;
    private String name;
    private int age;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
    
}