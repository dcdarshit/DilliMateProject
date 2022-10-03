package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import com.dillimate.entities.Driver;

public interface CabService {
	
	 Driver addCabDriver(Driver driver);
	
	 Optional<Driver> findById(Long id);
	 
	 List<Driver> getListOfCabDriverDetails();
	 
	 Driver getById(Long id);
	 
	 void deleteById(Long id);

}
