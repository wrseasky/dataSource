package com.baidu.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.pojo.User;
import com.baidu.service.UserService;

/**
 * @author 作者 wr:
 * @version 创建时间：2018年4月16日 上午11:17:12 类说明
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/insert")
	public Integer insertUser() {
		return userService.insertUser();
	}

	@RequestMapping("/select")
	public User selectByPrimaryKey() {
		return userService.selectByPrimaryKey();
	}
}
