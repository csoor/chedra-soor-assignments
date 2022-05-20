package com.codingdojo.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class OmikujiController {
	@RequestMapping("/omikuji")
	public String omikuji()
	{
		return "Index.jsp";
	}
	@RequestMapping(value = "/message", method = RequestMethod.POST)
	public String omikujiCard(
			@RequestParam(value="number") int number, 
			@RequestParam(value="city") String city,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="cat") String cat,
			HttpSession session)
	{
		String message = String.format("You number is %s and your new home will be in %s. %s is your new hobby while you are at you picked up %s is your new cat"
				, number, city, hobby, cat);
		session.setAttribute("message", message);
		return "redirect:/omikuji/show";
	}
	@RequestMapping("/omikuji/show")
	public String show(HttpSession session, Model model)
	{
		String result = (String) session.getAttribute("message");
		model.addAttribute("result", result);
		return "Omikuji.jsp";
	}
	
}
