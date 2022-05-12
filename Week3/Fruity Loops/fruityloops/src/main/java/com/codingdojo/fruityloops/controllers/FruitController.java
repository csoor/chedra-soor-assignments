package com.codingdojo.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.fruityloops.models.Fruit;

@Controller
public class FruitController {
	@RequestMapping("/")
	public String fruits(Model model)
	{
		ArrayList<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit("Kiwi", 1.5));
		fruits.add(new Fruit("Strawberry", 3.5));
		fruits.add(new Fruit("Dragon Fruit", 4.5));
		fruits.add(new Fruit("Banana", 2.5));
		
		model.addAttribute("fruits", fruits);
		
		return "FruitStore.jsp";
	}
}
