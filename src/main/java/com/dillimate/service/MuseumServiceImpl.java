package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dillimate.entities.Museum;
import com.dillimate.repository.MuseumRepository;

@Service
public class MuseumServiceImpl implements MuseumService {
	
	@Autowired
	private MuseumRepository museumRepository;

	@Override
	public Museum addMuseum(Museum museum) {
		return museumRepository.save(museum);
	}

	@Override
	public Optional<Museum> findById(Long id) {
		return museumRepository.findById(id);
	}

	@Override
	public List<Museum> getListOfMuseumDetails() {
		return museumRepository.findAll();
	}

	@Override
	public Museum getById(Long id) {
		return museumRepository.getById(id);
	}

	@Override
	public void deleteById(Long id) {
		museumRepository.deleteById(id);;
	}

}
