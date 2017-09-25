package com.birdsh.chen.demo.model;

import com.birdsh.chen.demo.constant.ReturnCode;

/**
 * @ClassName: DataModel.java
 * @Description:返回的结果集
 * @author chenhuihui
 * @time 2017年9月25日下午1:27:36
 */
public class DataModel<T> {
	private Integer code;
	private String message;
	private T data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public DataModel() {
		// TODO Auto-generated constructor stub
	}

	// 返回失败
	public DataModel(Integer code, String error) {
		this.code = code;
		this.message = error;
	}

	// 返回成功
	public DataModel(Integer code, T data) {
		this.code = code;
		this.data = data;
	}
	
	

	public void returnDetail(ReturnCode rec){
		this.code = rec.getCode();
		this.message = rec.getMessage();
		
	}

}
