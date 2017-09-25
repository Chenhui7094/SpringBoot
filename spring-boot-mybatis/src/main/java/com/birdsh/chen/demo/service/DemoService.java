package com.birdsh.chen.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birdsh.chen.demo.bean.Demo;
import com.birdsh.chen.demo.bean.PageBean;
import com.birdsh.chen.demo.bean.querybean.DemoQueryBean;
import com.birdsh.chen.demo.constant.ReturnCode;
import com.birdsh.chen.demo.mapper.DemoMappper;
import com.birdsh.chen.demo.model.DataModel;
import com.github.pagehelper.PageHelper;

@Service
public class DemoService {

	@Autowired
	private DemoMappper demoMappper;
	
	public DataModel<PageBean<Demo>> likeName(DemoQueryBean queryBean){
		DataModel<PageBean<Demo>> dataModel = new DataModel<>();
		
		PageHelper.startPage(queryBean.getPageNum(),queryBean.getPageSize(),true, false, false);
		List<Demo> demoList = demoMappper.likeName(queryBean);
//		List<Demo> demoList = demoMappper.likeName(queryBean.getName());//和mapper要保持一致
		PageBean<Demo> list = new PageBean<>(demoList);
		dataModel.setData(list);
		dataModel.returnDetail(ReturnCode.Operation_Succeeded);
        return dataModel;

    }
}
