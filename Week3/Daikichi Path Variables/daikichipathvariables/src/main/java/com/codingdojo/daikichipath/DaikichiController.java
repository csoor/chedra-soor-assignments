package com.codingdojo.daikichipath;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String hello()
	{
		return "Welcome to Daikichi Routes";
	}
	@RequestMapping("/today")
	public String today()
	{
		return "Today is a new day";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow()
	{
		return "Let's explore more of Java";
	}
	//New routes
	@RequestMapping("/travel/{city}") 
	//{city} will take in what users response and display it in our return
	public String travel(@PathVariable String city)
	{
		return "Congrats! You are travling to " + city;
	}
	
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable int num)
	{
		if(num % 2 == 0) //If even
		{
			return "You are on your way to a GRAND JOURNEY but weary of temping offers";
		}
		else
		{
			return "You will enjoy the fruits of your labor";
		}
	}
}
