package com.zhiyou100.SpringBoot.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandler2 {
	@ExceptionHandler
	@ResponseBody
	public String exceptionHandler(HttpServletRequest req,Exception e){
		System.out.println(e.getLocalizedMessage());
		return "网页走丢了";
	}
	
}
