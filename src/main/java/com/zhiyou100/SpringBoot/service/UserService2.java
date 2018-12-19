package com.zhiyou100.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhiyou100.SpringBoot.model.User;
import com.zhiyou100.SpringBoot.repository.UserRepository;
import com.zhiyou100.SpringBoot.repository.UserRepository2;
@Service
public class UserService2 {

	@Autowired
	private UserRepository2 userRepository2;

	public User findByName(String name){
		return userRepository2.findByName(name);
	};
	
	
	
	public User xx(String n){
		return userRepository2.xx(n);
	};
}
