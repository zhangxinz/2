package com.zhiyou100.SpringBoot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.zhiyou100.SpringBoot.model.User;

public interface UserRepository3 extends PagingAndSortingRepository<User, Integer>{

	//  查询方法要以get，find，read开头，条件查询属性用关键字连接
	//  条件查询查询的属性首字母要大写
	//  使用Query注解  写HQL语句
	
}
