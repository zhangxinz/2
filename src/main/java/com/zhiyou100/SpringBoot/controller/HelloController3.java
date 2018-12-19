package com.zhiyou100.SpringBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.SpringBoot.model.User;
import com.zhiyou100.SpringBoot.service.UserService3;

@RestController
//@RestController 相当于在本类的所有requestMapping之上贴了@ResponseBody
public class HelloController3 {
	@Autowired
	UserService3 userService3;

	// SpringBoot支持JSON，会把返回对象与数组默认以JSON方式显示
	@RequestMapping("/userAll")
	public List<User> userAll(){
		Pageable page =new PageRequest(2, 2);
		Page<User> p = userService3.UserAll(page);
		//当前查询的是第几页
		System.out.println(p.getNumber());
		//当前页面的信息条数
		System.out.println(p.getNumberOfElements());
		System.out.println(p.getSize());
		//总条数
		System.out.println(p.getTotalElements());
		//总页数
		System.out.println(p.getTotalPages());
		System.out.println(5/0);
		//查询的结果集
		return p.getContent();
	}
	
	
}
