package com.codingdojo.dojoninja.mvc.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojoninja.mvc.models.Dojos;
import com.codingdojo.dojoninja.mvc.models.Ninjas;
import com.codingdojo.dojoninja.mvc.repositories.NinjaRepositories;

@Service
public class NinjaServices {
	private final NinjaRepositories ninjaRepository;
	
	public NinjaServices(NinjaRepositories ninjaRepository)
	{
		this.ninjaRepository = ninjaRepository;
	}
	public List<Ninjas> allNinjas()
	{
		return ninjaRepository.findAll();
	}
	public Ninjas createNinja(Ninjas n)
	{
		return ninjaRepository.save(n);
	}
	public Ninjas findNinja(Long id)
	{
		Optional<Ninjas> optionNinja = ninjaRepository.findById(id);
		if(optionNinja.isPresent())
		{
			return optionNinja.get();
		}
		else
		{
			return null;
		}
	}
	public List<Ninjas> byDojo(Dojos dojo)
	{
		return ninjaRepository.findAllByDojo(dojo);
	}
}
