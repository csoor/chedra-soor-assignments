package com.codingdojo.dojoninja.mvc.controllers;

import com.codingdojo.dojoninja.mvc.models.Dojos;
import com.codingdojo.dojoninja.mvc.models.Ninjas;
import com.codingdojo.dojoninja.mvc.services.DojoServices;
import com.codingdojo.dojoninja.mvc.services.NinjaServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controllers {
	
	@Autowired
	private DojoServices dojo;
	@Autowired
	private NinjaServices ninja;
	
	
}
