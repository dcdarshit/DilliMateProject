package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dillimate.entities.Driver;
import com.dillimate.repository.CabRepository;

@Service
public class CabServiceImpl implements CabService {
	
	@Autowired
	private CabRepository cabRepository;

	@Override
	public Driver addCabDriver(Driver driver) {
		return cabRepository.save(driver);
	}

	@Override
	public Optional<Driver> findById(Long id) {
		return cabRepository.findById(id);
	}

	@Override
	public List<Driver> getListOfCabDriverDetails() {
		return cabRepository.findAll();
	}

	@Override
	public Driver getById(Long id) {
		return cabRepository.getById(id);
	}

	@Override
	public void deleteById(Long id) {
		cabRepository.deleteById(id);
	}

}
