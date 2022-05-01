package com.codingdojo.controllers;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class OmikujiController {
	@RequestMapping("/omikuji")
	public String omikuji()
	{
		return "index.jsp";
	}
	@RequestMapping("/omikuji/show")
	public String show(HttpSession session, Model model)
	{
		String result = (String) session.getAttribute("result");
		model.addAttribute("result", result);
		return "Omikuji.jsp";
	}
	
}
