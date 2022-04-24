package com.codingdojo.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String hello()
	{
		return "Welcome!";
	}
	@RequestMapping("/today")
	public String today()
	{
		return "Today you will get your work done!";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow()
	{
		return "Stop procrasting and finish your work earlier";
	}
}
