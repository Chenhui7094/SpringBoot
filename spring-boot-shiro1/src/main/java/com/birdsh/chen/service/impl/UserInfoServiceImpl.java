package com.birdsh.chen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birdsh.chen.bean.UserInfo;
import com.birdsh.chen.repository.UserInfoRepository;
import com.birdsh.chen.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoRepository userInfoRepository;
	@Override
	public UserInfo findByUsername(String username) {
		System.out.println("UserInfoServiceImpl.findByUsername()");
		
		return userInfoRepository.findByUsername(username);
	}

}
