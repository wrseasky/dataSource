package com.baidu.service;

import java.util.UUID;

import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.mapper.UserMapper;
import com.baidu.pojo.User;

/**
 * @author 作者 wr:
 * @version 创建时间：2018年4月16日 上午11:10:27 类说明
 */
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public Integer insertUser() {
		User user = new User();
		user.setUserName(UUID.randomUUID().toString());
		user.setPassword("password");
		user.setAge(10);
		user.setStatus(0);
		int insert = userMapper.insert(user);
		return insert;
	}

	public User selectByPrimaryKey() {
		User user = userMapper.selectByPrimaryKey(1);
		return user;
	}

}
