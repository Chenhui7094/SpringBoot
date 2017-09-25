package com.birdsh.chen.demo.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.github.pagehelper.Page;

/**
 * 分页属性结果封装
 * 
 * @author chenhui
 *
 */
public class PageBean<T> implements Serializable {

	private static final long serialVersionUID = -8441315830430608091L;

	// 总记录数
	private long total;
	// 结果集
	private List<T> list;
	// 总页数
	private int pages;
	// 当前页的数量 <= pageSize，该属性来自ArrayList的size属性
	private int size;
	

	public long getTotal() {
		return total;
	}


	public void setTotal(long total) {
		this.total = total;
	}


	public List<T> getList() {
		return list;
	}


	public void setList(List<T> list) {
		this.list = list;
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/**
	 * 包装Page对象
	 * 
	 * @param list
	 *            page结果
	 * @param navigatePages
	 *            页码数量
	 */
	public PageBean(List<T> list) {
		if (list instanceof Page) {
			Page<T> page = (Page<T>) list;
			this.pages = page.getPages();
			this.list = page;
			this.size = page.size();
			this.total = page.getTotal();
		} else if (list instanceof Collection) {
			this.pages = 1;
			this.list = list;
			this.size = list.size();
			this.total = list.size();
		}
	}

}
