package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("/greet")
	public String getGreeting() {
		System.out.println(">>>>>>>------- Testing Configuration >>>>>>>------");
		return "Hello";
	}
}
