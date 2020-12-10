package com.fpl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpl.entity.Difficulty;
import com.fpl.repository.DifficultyRepository;

@Service
public class DifficultyServiceImpl implements DifficultyService {


	@Autowired
	private DifficultyRepository repository;	

	
	@Override
	public List<Difficulty> findAll() {
		
		List<Difficulty> difficultyList = repository.findAll();
		
		return difficultyList;
	}

	@Override
	public Difficulty findDifficulty(int id) {
		Optional<Difficulty> difficulty = repository.findById(id);
		if(difficulty.isPresent()) {
			return difficulty.get();
		}
		return null;
	}

	@Override
	public void save(Difficulty difficulty) {
				
		repository.save(difficulty);
	}


}