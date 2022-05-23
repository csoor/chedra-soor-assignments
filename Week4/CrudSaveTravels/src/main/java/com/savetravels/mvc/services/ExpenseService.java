package com.savetravels.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savetravels.mvc.models.Expense;
import com.savetravels.mvc.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	//adding expense repository as a dependency
	//private final ExpenseRepository expenseRepo;
	
	//public ExpenseService(ExpenseRepository expenseRepo) {
	//	this.expenseRepo = expenseRepo;
	//}
	@Autowired
	private ExpenseRepository expenseRepo;
	
	//Returns all the expenses
	public List<Expense> allExpense(){
		return expenseRepo.findAll();
	}
	//Create Expense
	public Expense createExpense(Expense e)
	{
		return expenseRepo.save(e);
	}
	//Retrieves a expense
	public Expense findExpense(long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	//Deletes 
	public void delete(Long id) {
		Optional<Expense> expenseID = expenseRepo.findById(id);
		if(expenseID.isPresent()) {
			expenseRepo.deleteById(id);
		}
	}
}
