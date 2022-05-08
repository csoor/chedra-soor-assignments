package com.codingdojo.dojoninja.mvc.repositories;

import com.codingdojo.dojoninja.mvc.models.Dojos;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DojoRepositories extends CrudRepository<Dojos, Long>{
	List<Dojos> findAll();
}
