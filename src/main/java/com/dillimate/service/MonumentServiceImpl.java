package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dillimate.entities.Monument;
import com.dillimate.repository.MonumentRepository;

@Service
public class MonumentServiceImpl implements MonumentService {

	@Autowired
	private MonumentRepository monumentRepository;
	
	@Override
	public Monument addMonument(Monument monument) {
		return monumentRepository.save(monument);
	}

	@Override
	public Optional<Monument> findById(Long id) {
		return monumentRepository.findById(id);
	}

	@Override
	public List<Monument> getListOfMonumentDetails() {
		return monumentRepository.findAll();
	}

	@Override
	public Monument getById(Long id) {
		return monumentRepository.getById(id);
	}

	@Override
	public void deleteById(Long id) {
		monumentRepository.deleteById(id);
	}

}
