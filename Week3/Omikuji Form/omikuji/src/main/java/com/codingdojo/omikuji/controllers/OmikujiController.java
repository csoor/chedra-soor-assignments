package com.codingdojo.omikuji.controllers;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class OmikujiController {
	@GetMapping("/omikuji")
	public String omikuji()
	{
		return "Index.jsp";
	}
	@RequestMapping(value = "/message", method = RequestMethod.POST)
	public String omikujiCard(
			@RequestParam(value="number") int number, 
			@RequestParam(value="city") String city,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="cat") String cat)
	{
		System.out.printf("You number is % and your new home will be in %. % is your new hobby while you are at you picked up % your new cat"
				, number, city, hobby, cat);
		
		return "redirect:/omikuji/show";
	}
	@RequestMapping("/omikuji/show")
	public String show(HttpSession session, Model model)
	{
		String result = (String) session.getAttribute("result");
		model.addAttribute("result", result);
		return "Omikuji.jsp";
	}
	
}
