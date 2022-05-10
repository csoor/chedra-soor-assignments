package com.codingdojo.daikichipath.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiPathController {
	@RequestMapping("")
	public String daikichi()
	{
		return "Hi, Welcome to Daikichi Paths!";
	}
	@RequestMapping("/travel")
	public String travels(@RequestParam(value="t") String destination) //In browser search /travel/?t=<user input>
	{
		return "Congrats your travel destination is going to be " + destination;
	}
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable("num") int num)
	{
		if (num % 2 == 0)
		{
			return "Struggling is apart of living";
		}
		else 
		{
		return "May the force be with you! ";
		}
	}
}
