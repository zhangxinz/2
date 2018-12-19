package com.zhiyou100.SpringBoot.repository;

import org.springframework.data.repository.CrudRepository;

import com.zhiyou100.SpringBoot.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
