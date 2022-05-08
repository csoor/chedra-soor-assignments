package com.codingdojo.dojoninja.mvc.repositories;

import com.codingdojo.dojoninja.mvc.models.Dojos;
import com.codingdojo.dojoninja.mvc.models.Ninjas;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NinjaRepositories extends CrudRepository<Ninjas, Long>{
	List<Ninjas> findAll();
	List<Ninjas> findAllByDojo(Dojos dojo);
}
