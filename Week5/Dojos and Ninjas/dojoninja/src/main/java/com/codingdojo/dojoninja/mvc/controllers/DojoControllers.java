package com.codingdojo.dojoninja.mvc.controllers;

import com.codingdojo.dojoninja.mvc.models.Dojos;
import com.codingdojo.dojoninja.mvc.services.DojoServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dojo")
public class DojoControllers {
	
	@Autowired
	private DojoServices dojo;

	@GetMapping("/new")
	public String createDojo(@ModelAttribute("dojo") Dojos dojo)
	{
		return "Dojo.jsp";
	}
	
	
}
