package com.yang.redis;

import com.yang.redis.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class RedisApplicationTests {

	@Resource
	private RedisTemplate redisTemplate;

	@Autowired
	private RedisUtil redisUtil;

	@Test
	void contextLoads() {
//		redisTemplate.opsForValue().set("name", "yangjinanzhi");
//		System.out.println(redisTemplate.opsForValue().get("name"));

		redisUtil.set("name", "yangjianzhi");
		System.out.println(redisUtil.get("name"));
	}

}
