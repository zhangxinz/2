package com.zhiyou100.SpringBoot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.SpringBoot.model.User;

@Controller
@RequestMapping("/templates")
//@RestController 相当于在本类的所有requestMapping之上贴了@ResponseBody
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(Map<String, Object> map){
		map.put("msg","哈哈哈哈哈");
		return "xxxxxx";
	}
	// SpringBoot支持JSON，会把返回对象与数组默认以JSON方式显示
	@RequestMapping("/getUser")
	public List<User> getUser(){
		List<User> list=new ArrayList<>();
		list.add(new User(1, "张三", 22));
		list.add(new User(2, "李四", 22));
		list.add(new User(3, "王五", 22));
		return list;
	}
	
	
}
