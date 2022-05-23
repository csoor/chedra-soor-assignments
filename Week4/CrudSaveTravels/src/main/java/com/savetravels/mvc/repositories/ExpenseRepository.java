package com.savetravels.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.savetravels.mvc.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	//Retrieves all expenses from database
	List<Expense> findAll();
	
	//Not Needed
	//Finds expenses by description
	//List<Expense> findByDescription(String search);
	//Counts how titles contain certain string
	//Long countByTitle(String search);
	//deletes a expense with a specific ID
	//Long deleteById(Long id);
}
