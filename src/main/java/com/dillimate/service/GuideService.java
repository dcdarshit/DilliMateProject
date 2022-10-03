package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import com.dillimate.entities.Guide;

public interface GuideService {
	
	Guide addGuide(Guide guide);
	
	Optional<Guide> findById(Long id);
	
	List<Guide> getListOfTouristGuideDetails();
	
	Guide getById(Long id);
	
	void deleteById(Long id);

}
