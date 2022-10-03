package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dillimate.entities.Restaurant;
import com.dillimate.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
	private RestaurantRepository restRepository;

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {
		return restRepository.save(restaurant);
	}

	@Override
	public Optional<Restaurant> findById(Long id) {
		return restRepository.findById(id);
	}

	@Override
	public List<Restaurant> getListOfRestaurantDetails() {
		return restRepository.findAll();
	}

	@Override
	public Restaurant getById(Long id) {
		return restRepository.getById(id);
	}

	@Override
	public void deleteById(Long id) {
		restRepository.deleteById(id);
	}

}
