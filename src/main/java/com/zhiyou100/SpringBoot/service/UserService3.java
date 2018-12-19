package com.zhiyou100.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhiyou100.SpringBoot.model.User;
import com.zhiyou100.SpringBoot.repository.UserRepository;
import com.zhiyou100.SpringBoot.repository.UserRepository3;
@Service
public class UserService3 {

	@Autowired
	private UserRepository3 userRepository3;

	
	
	public Page<User> UserAll(Pageable page){
		return  userRepository3.findAll(page);
	};
}
