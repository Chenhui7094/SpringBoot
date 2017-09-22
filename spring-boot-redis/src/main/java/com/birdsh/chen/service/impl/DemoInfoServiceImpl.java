package com.birdsh.chen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.birdsh.chen.bean.DemoInfo;
import com.birdsh.chen.repository.DemoInfoRepository;
import com.birdsh.chen.service.DemoInfoService;

/**
 * @ClassName: DemoInfoServiceImpl.java 
 * @Description:DemoInfo数据处理类 
 * @author chenhuihui
 * @time 2017年9月21日下午5:01:49
 */
@Service
public class DemoInfoServiceImpl implements DemoInfoService {

	@Autowired
	private DemoInfoRepository demoInfoRepository;
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;

//	@Cacheable 支持如下几个参数：
//	value：缓存位置名称，不能为空，如果使用EHCache，就是ehcache.xml中声明的cache的name
//	key：缓存的key，默认为空，既表示使用方法的参数类型及参数值作为key，支持SpEL
// 	condition：触发条件，只有满足条件的情况才会加入缓存，默认为空，既表示全部都加入缓存，支持SpEL
	
//  将缓存保存进andCache，并使用参数中的userId加上一个字符串(这里使用方法名称)作为缓存的key   
//	@Cacheable(value="andCache",key="#userId + 'findById'")  
	
//  将缓存保存进andCache，并当参数userId的长度小于32时才保存进缓存，默认使用参数值及类型作为缓存的key  
//  @Cacheable(value="andCache",condition="#userId.length < 32")  
	
	@Cacheable(value="demoInfo") //缓存,这里没有指定key. 
	@Override
	public DemoInfo findById(long id) {
		System.out.println("DemoInfoServiceImpl.findById()=========从数据库中进行获取的....id="+id);  
		return demoInfoRepository.findOne(id);
	}
	
//	@CacheEvict 支持如下几个参数：
//	value：缓存位置名称，不能为空，同上
//	key：缓存的key，默认为空，同上
//	condition：触发条件，只有满足条件的情况才会清除缓存，默认为空，支持SpEL
//	allEntries：true表示清除value中的全部缓存，默认为false
	
//	清除掉指定key的缓存  
//	@CacheEvict(value="andCache",key="#user.userId + 'findById'")  
	
	@CacheEvict(value="demoInfo")  
	@Override
	public void deleteFromCache(long id) {
		 System.out.println("DemoInfoServiceImpl.delete().从缓存中删除.");

	}

	@Override
	public void test() {
		ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
		//放入key为mykey4，value是随机数的键值对
		valueOperations.set("mykey4", "random1="+Math.random());
		System.out.println(valueOperations.get("mykey4"));  

	}

}
