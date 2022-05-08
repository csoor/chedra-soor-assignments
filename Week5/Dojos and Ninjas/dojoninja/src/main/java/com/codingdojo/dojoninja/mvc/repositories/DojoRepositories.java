package com.codingdojo.dojoninja.mvc.repositories;

import com.codingdojo.dojoninja.mvc.models.Dojos;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DojoRepositories extends CrudRepository<Dojos, Long>{
	List<Dojos> findAll();
}
