package com.dillimate.service;

import java.util.List;
import java.util.Optional;
import com.dillimate.entities.Monument;

public interface MonumentService {
	
    Monument addMonument(Monument monument);
	
	Optional<Monument> findById(Long id);
	
	List<Monument> getListOfMonumentDetails();
	
	Monument getById(Long id);
	
	void deleteById(Long id);

}
