package com.fpl.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.fpl.entity.Difficulty;
import com.fpl.entity.DifficultyJoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpl.repository.DifficultyRepository;

@Service
public class DifficultyServiceImpl implements DifficultyService {

	private DifficultyRepository repository;
	
	private static Map<Integer, Integer> homeMap = new HashMap<>();
	private static Map<Integer, Integer> awayMap = new HashMap<>();

	@Autowired
	public DifficultyServiceImpl(DifficultyRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Difficulty> findAll() {
		
		List<Difficulty> difficultyList = repository.findAll();
		for(Difficulty d : difficultyList) {
			homeMap.put(d.getTeam(),d.getHome());
			awayMap.put(d.getTeam(),d.getAway());

		}
		
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
		
		if(!homeMap.containsKey(difficulty.getTeam())) {
			homeMap.put(difficulty.getTeam(), difficulty.getHome());
		}
		if(!awayMap.containsKey(difficulty.getTeam())) {
			awayMap.put(difficulty.getTeam(), difficulty.getAway());
		}
		
		
		repository.save(difficulty);
	}
	@Override
	public Map<Integer, Integer> getHomeMap() {
		return homeMap;
	}
	@Override
	public Map<Integer, Integer> getAwayMap() {
		return awayMap;
	}

	@Override
	public List<DifficultyJoin> findJoinDifficulty() {

		return repository.findDifficultyJoin();
	}

}