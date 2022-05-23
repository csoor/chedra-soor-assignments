package com.savetravels.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.savetravels.mvc.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	//Retrieves all expenses from database
	List<Expense> findAll();
	//Finds expenses by description
	List<Expense> findByDescription(String search);
	//Counts how titles contain certain string
	Long countByTitle(String search);
	//deletes a expense that starts with a specific title
	Long deleteByTitle(String search);
}
