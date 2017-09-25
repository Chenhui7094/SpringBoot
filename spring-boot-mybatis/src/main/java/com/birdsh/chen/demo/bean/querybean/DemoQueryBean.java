package com.birdsh.chen.demo.bean.querybean;

import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName: DemoQueryBean.java 
 * @Description:业务中用到的参数的实体类
 * @author chenhuihui
 * @time 2017年9月25日下午1:25:41
 */
public class DemoQueryBean {

	@ApiModelProperty(value = "Demo姓名")
	private String name;
	
	@ApiModelProperty(value = "页码")
	private int pageNum;
	
	@ApiModelProperty(value = "页码大小")
	private int pageSize;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
