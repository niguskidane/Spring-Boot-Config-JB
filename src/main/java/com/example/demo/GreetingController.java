package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService service;

	@Autowired
	DbSettings dbSettings;

	@Value("${my.greeting: default value}")
	private String greetingMessage;

	@Value("some static message")
	private String staticValue;

	@Value("${my.list.value}")
	private List<String> myList;

	@Value("#{${dbValues}}")
	private Map<String, String> dbVal;

	@GetMapping("/greet")
	public String getGreeting() {
		return greetingMessage + " " + staticValue + " " + myList + " " + dbVal;
	}

	@GetMapping("/list")
	public List<String> getList() {
		return service.printList(myList);
	}

	@GetMapping("/dbSettings")
	public String getDbSettings() {
		return dbSettings.getConnection() + " " + dbSettings.getHost() + " " + dbSettings.getPort();
	}

}
