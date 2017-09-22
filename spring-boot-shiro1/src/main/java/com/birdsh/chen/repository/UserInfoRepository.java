package com.birdsh.chen.repository;

import org.springframework.data.repository.CrudRepository;

import com.birdsh.chen.bean.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {
	/**通过username查找用户信息;*/  
    public UserInfo findByUsername(String username); 
}
