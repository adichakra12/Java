package com.adityachakravarthi.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adityachakravarthi.dojosandninjas.models.Dojo;
import com.adityachakravarthi.dojosandninjas.models.Ninja;
import com.adityachakravarthi.dojosandninjas.repositories.DojoRepository;
import com.adityachakravarthi.dojosandninjas.repositories.NinjaRepository;


@Service
public class DojoAndNinjaService {
	
	@Autowired
	private DojoRepository dojoRepo;
	@Autowired
	private NinjaRepository ninjaRepo;
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public Dojo getDojo(long id) {
		return dojoRepo.findById(id).orElse(null);
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}
	
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	public Ninja getNinja(long id) {
		return ninjaRepo.findById(id).orElse(null);
	}
	
	public Ninja addNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}
	
//	public Dojo updateDojo(Dojo dojo) {
//    	Optional<Dojo> optionalDojo = dojoRepo.findById(dojo.getId());
//    	
//    	if(optionalDojo.isPresent()) {
//    		
//    		Dojo thisDojo = optionalDojo.get();
//            
//    		thisDojo.setName(dojo.getName());
//            
//            return dojoRepo.save(thisDojo);
//        } else {
//            return null;
//        }
//    }

}
