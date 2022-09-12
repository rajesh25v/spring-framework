package com.createiq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeWorld {

	@RequestMapping("/")
	public String welcome() {
		
		return "welcome to java programming";
	}
	
}
