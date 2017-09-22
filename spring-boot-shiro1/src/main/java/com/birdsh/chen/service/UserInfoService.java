package com.birdsh.chen.service;

import com.birdsh.chen.bean.UserInfo;

public interface UserInfoService {
	 /**通过username查找用户信息;*/  
    public UserInfo findByUsername(String username);

}
