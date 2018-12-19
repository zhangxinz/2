package com.zhiyou100.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhiyou100.SpringBoot.model.User;
import com.zhiyou100.SpringBoot.repository.UserRepository;
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public void save(User user){
		userRepository.save(user);
	}
	
	@Transactional
	public void delete(int id){
		userRepository.deleteById(id);
	}
	
	public User getUser(int id){
		return userRepository.findById(id).get();
	}
	
	public Iterable<User> getAllUser(){
		return userRepository.findAll();
	}
}
