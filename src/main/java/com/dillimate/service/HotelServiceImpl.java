package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dillimate.entities.Hotel;
import com.dillimate.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public Optional<Hotel> findById(Long id) {
		return hotelRepository.findById(id);
	}

	@Override
	public List<Hotel> getListOfHotelDetails() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getById(Long id) {
		return hotelRepository.getById(id);
	}

	@Override
	public void deleteById(Long id) {
		hotelRepository.deleteById(id);
	}

}
