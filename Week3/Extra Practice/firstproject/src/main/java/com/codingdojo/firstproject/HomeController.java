package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	// Annotation
	@RequestMapping("/")
	//Method that maps to the request route above
	public String hello()
	{
		return "Hello New World!";
	}
}
