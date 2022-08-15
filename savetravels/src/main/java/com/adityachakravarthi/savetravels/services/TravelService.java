package com.adityachakravarthi.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adityachakravarthi.savetravels.models.Travel;
import com.adityachakravarthi.savetravels.repos.TravelRepository;

@Service
public class TravelService {
	
	@Autowired
	private TravelRepository travelrepo;
	
	
	public List<Travel> allTravels(){
		return travelrepo.findAll();
	}
	
	public Travel oneTravel(long id) {
		Optional<Travel> optionalTravel = travelrepo.findById(id);
        if(optionalTravel.isPresent()) {
            return optionalTravel.get();
        } else {
            return null;
        }
	}
	
	public Travel createTravel(Travel travel) {
		return travelrepo.save(travel);
	}
	
	public void deleteTravel(Long id) {
		travelrepo.deleteById(id);
	}
	
	public Travel updateExpense(Travel travel) {
    	Optional<Travel> optionalTravel = travelrepo.findById(travel.getId());
    	
    	if(optionalTravel.isPresent()) {
    		
    		Travel thisTravel = optionalTravel.get();
            
    		thisTravel.setTitle(travel.getTitle());
    		thisTravel.setDescription(travel.getDescription());
    		thisTravel.setVendor(travel.getVendor());
    		thisTravel.setAmount(travel.getAmount());
            
            return travelrepo.save(thisTravel);
        } else {
            return null;
        }
    }

}
