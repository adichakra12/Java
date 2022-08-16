package com.adityachakravarthi.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adityachakravarthi.dojosandninjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();

}