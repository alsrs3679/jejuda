package com.jejuda.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.jejuda.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping(value="/test")
	public String test(int no) {
		System.out.println("컨트롤러 접근");
		String pass = userService.test(no);
		
		System.out.println(pass);
		return "/";
		
	}
	
	
	
}