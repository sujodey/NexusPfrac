package com.cap.webapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/hello")
	public String myHelloWorld()
	{
		return "Hello Sujoy";
	}

}
