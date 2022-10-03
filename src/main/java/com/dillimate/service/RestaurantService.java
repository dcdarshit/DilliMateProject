package com.dillimate.service;

import java.util.List;
import java.util.Optional;
import com.dillimate.entities.Restaurant;

public interface RestaurantService {
	
	 Restaurant addRestaurant(Restaurant restaurant);
		
	 Optional<Restaurant> findById(Long id);
	 
	 List<Restaurant> getListOfRestaurantDetails();
	 
	 Restaurant getById(Long id);
	 
	 void deleteById(Long id);

}
