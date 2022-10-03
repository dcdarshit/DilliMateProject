package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import com.dillimate.entities.Hotel;

public interface HotelService {
	
    Hotel addHotel(Hotel hotel);
	
	Optional<Hotel> findById(Long id);
	
	List<Hotel> getListOfHotelDetails();
	
	Hotel getById(Long id);
	
	void deleteById(Long id);

}
