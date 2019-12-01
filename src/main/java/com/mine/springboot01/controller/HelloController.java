package com.mine.springboot01.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wfh@王丰华lag,com
 * @date 2019/11/29 2:25
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "hello springboot";
	}
}
