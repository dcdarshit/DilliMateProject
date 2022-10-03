package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dillimate.entities.Clinic;
import com.dillimate.repository.HealthRepository;

@Service
public class HealthServiceImpl implements HealthService{
	
	@Autowired
	private HealthRepository healthRepository;

	@Override
	public Clinic addClinic(Clinic clinic) {
		return healthRepository.save(clinic);
	}

	@Override
	public Optional<Clinic> findById(Long id) {
		return healthRepository.findById(id);
	}

	@Override
	public List<Clinic> getListOfClinicDetails() {
		return healthRepository.findAll();
	}

	@Override
	public Clinic getById(Long id) {
		return healthRepository.getById(id);
	}

	@Override
	public void deleteById(Long id) {
		healthRepository.deleteById(id);
	}

}
