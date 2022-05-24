package com.savetravels.mvc.controllers;

//import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		return "redirect:/expenses";	}
	@RequestMapping("/expenses")
	public String newExpense(@ModelAttribute("expenses") Expense expense, Model m)
	{
		//List<Expense> e = expenseService.allExpense();
		m.addAttribute("expense", expenseService.allExpense());
		return "index.jsp";
	}
	@RequestMapping("/expenses/show/{id}")
	public String show(@PathVariable("id") Long id, Model m) {
		
		m.addAttribute("expense", expenseService.findExpense(id));
		return "show.jsp";
	}
	@RequestMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model m) {
		
		Expense edit = expenseService.findExpense(id);
		m.addAttribute("edit", edit);
		return "edit.jsp";
	}
	@PostMapping("/expenses/{id}")
	public String update(@PathVariable("id") Long id,@Valid @ModelAttribute("edit") Expense expense, BindingResult result, Model m) {
		if(result.hasErrors()) {
			m.addAttribute("edit", expenseService.allExpense());
			return "edit.jsp";
		} else {
			expenseService.updateExpense(expense);
			return "redirect:/expenses";
		}
	}
	@PostMapping("/travels")
	public String create(@Valid @ModelAttribute("expenses") Expense expense, BindingResult result, Model m)
	{
		if(result.hasErrors()) {
			m.addAttribute("expense", expenseService.allExpense());
			return "index.jsp";
		} else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	
//DeleteMapping("/expenses/delete/{id}")
	@PostMapping("/expenses/delete/{id}")
	public String destroy(@PathVariable Long id) {
		expenseService.delete(id);
		return "redirect:/expenses";
	}
	

}
