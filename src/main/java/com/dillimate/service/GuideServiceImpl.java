package com.dillimate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dillimate.entities.Guide;
import com.dillimate.repository.GuideRepository;

@Service
public class GuideServiceImpl implements GuideService {
	
	@Autowired
	private GuideRepository guideRepository;

	@Override
	public Guide addGuide(Guide guide) {
		return guideRepository.save(guide);
	}

	@Override
	public Optional<Guide> findById(Long id) {
		return guideRepository.findById(id);
	}

	@Override
	public List<Guide> getListOfTouristGuideDetails() {
		return guideRepository.findAll();
	}

	@Override
	public Guide getById(Long id) {
		return guideRepository.getById(id);
	}

	@Override
	public void deleteById(Long id) {
		guideRepository.deleteById(id);
	}

}
