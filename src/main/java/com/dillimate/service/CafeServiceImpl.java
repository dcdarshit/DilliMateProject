package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dillimate.entities.Cafe;
import com.dillimate.repository.CafeRepository;

@Service
public class CafeServiceImpl implements CafeService{
	
	@Autowired
	private CafeRepository cafeRepository;

	@Override
	public Cafe addCafe(Cafe cafe) {
		return cafeRepository.save(cafe);
	}

	@Override
	public Optional<Cafe> findById(Long id) {
		return cafeRepository.findById(id);
	}

	@Override
	public List<Cafe> getListOfCafeDetails() {
		return cafeRepository.findAll();
	}

	@Override
	public Cafe getById(Long id) {
		return cafeRepository.getById(id);
	}

	@Override
	public void deleteById(Long id) {
		cafeRepository.deleteById(id);
	}

}
