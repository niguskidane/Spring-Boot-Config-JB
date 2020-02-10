package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public List<String> printList(List<String> list) {
		List<String> myList = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		return myList;
	}
}
