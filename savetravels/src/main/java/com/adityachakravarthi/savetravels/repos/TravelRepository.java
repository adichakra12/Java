package com.adityachakravarthi.savetravels.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adityachakravarthi.savetravels.models.Travel;

@Repository
public interface TravelRepository extends CrudRepository<Travel, Long>{
	List<Travel> findAll();
}