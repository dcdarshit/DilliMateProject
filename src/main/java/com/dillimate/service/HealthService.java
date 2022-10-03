package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import com.dillimate.entities.Clinic;


public interface HealthService {
	
	 Clinic addClinic(Clinic clinic);
	
	 Optional<Clinic> findById(Long id);
	 
	 List<Clinic> getListOfClinicDetails();
	 
	 Clinic getById(Long id);
	 
	 void deleteById(Long id);

}
