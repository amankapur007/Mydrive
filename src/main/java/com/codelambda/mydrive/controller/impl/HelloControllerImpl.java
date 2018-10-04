package com.codelambda.mydrive.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codelambda.mydrive.controller.HelloController;

@RestController
@RequestMapping("/api")
public class HelloControllerImpl implements HelloController{

	@GetMapping("/hello")
	public String hello() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
