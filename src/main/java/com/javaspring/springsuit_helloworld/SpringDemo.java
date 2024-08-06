package com.javaspring.springsuit_helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SpringDemo 
{
	@GetMapping("/hello")
	public String sayHello() 
	{
	    return "Welcome to SpringBoot Project using Initializer !!!";
	}
}
