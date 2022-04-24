package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class HumanController {
	@RequestMapping("")
	public String human()
	{
		return "Welcome Human";
	}
	@RequestMapping("/")
	public String human(@RequestParam(value = "name", required = false) String searchQuery)
	{
		return "Welcome " + searchQuery;
	}
}
