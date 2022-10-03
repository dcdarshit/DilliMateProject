package com.dillimate.service;

import java.util.List;
import java.util.Optional;
import com.dillimate.entities.Cafe;

public interface CafeService {
	
	 Cafe addCafe(Cafe cafe);
		
	 Optional<Cafe> findById(Long id);
	 
	 List<Cafe> getListOfCafeDetails();
	 
	 Cafe getById(Long id);
	 
	 void deleteById(Long id);

}
