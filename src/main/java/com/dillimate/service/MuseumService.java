package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import com.dillimate.entities.Museum;

public interface MuseumService {
	
	Museum addMuseum(Museum museum);
	
	Optional<Museum> findById(Long id);
	
	List<Museum> getListOfMuseumDetails();
	
	Museum getById(Long id);
	
	void deleteById(Long id);

}
