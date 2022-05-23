package com.savetravels.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.savetravels.mvc.models.Expense;
import com.savetravels.mvc.services.ExpenseService;

@Controller
public class MainController {
	
	@Autowired
	private ExpenseService expenseService;
	
	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	@RequestMapping("/expenses")
	public String newExpense(@ModelAttribute("expenses") Expense expense, Model m)
	{
		List<Expense> e = expenseService.allExpense();
		m.addAttribute("expenses", e);
		return "index.jsp";
	}
	@PostMapping("/travels")
	public String create(@Valid @ModelAttribute("expenses") Expense expense, BindingResult result)
	{
		if(result.hasErrors()) {
			
			return "index.jsp";
		} else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
}
