package com.codingdojo.dojoninja.mvc.services;

import com.codingdojo.dojoninja.mvc.models.Dojos;
import com.codingdojo.dojoninja.mvc.repositories.DojoRepositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class DojoServices {
	private final DojoRepositories dojoRepository;
	
	public DojoServices(DojoRepositories dojoRepository)
	{
		this.dojoRepository = dojoRepository;
	}
	//Return all dojos
	public List<Dojos> allDojos()
	{
		return dojoRepository.findAll();
	}
	//Creates a dojo
	public Dojos createDojo(Dojos d)
	{
		return dojoRepository.save(d);
	}
	//Retrieve a dojo
	public Dojos findDojo(Long id)
	{
		Optional<Dojos> optionDojo = dojoRepository.findById(id);
		if(optionDojo.isPresent())
		{
			return optionDojo.get();
		}
		else
		{
			return null;
		}
	}
}
