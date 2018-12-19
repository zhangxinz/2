package com.zhiyou100.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.SpringBoot.model.User;
import com.zhiyou100.SpringBoot.service.UserService;
import com.zhiyou100.SpringBoot.service.UserService2;

@RestController
public class UserController2 {

	@Autowired
	UserService2 userService;
	
	
	@RequestMapping("/getByName")
	public User getByName(){
		return userService.findByName("AJAX");
	}
	
	@RequestMapping("/xx")
	public User xx(){
		return userService.xx("AJAX");
	}
}
