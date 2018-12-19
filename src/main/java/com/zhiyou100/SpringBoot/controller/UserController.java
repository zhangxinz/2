package com.zhiyou100.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.SpringBoot.model.User;
import com.zhiyou100.SpringBoot.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/save")
	public void save(){
		User u=new User();
		u.setName("张三"); u.setAge(20);
		userService.save(u);
	}
	
	@RequestMapping("/get")
	public User get(){
		return userService.getUser(1);
	}
	@RequestMapping("/getAll")
	public List<User> getAll(){
		return (List<User>) userService.getAllUser();
	}
	@RequestMapping("/delete")
	public void delete(){
		userService.delete(1);
	}
}
