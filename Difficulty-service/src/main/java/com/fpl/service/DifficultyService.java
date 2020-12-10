package com.fpl.service;

import java.util.List;
import java.util.Map;

import com.fpl.entity.Difficulty;

public interface DifficultyService {
				
    public List<Difficulty> findAll();

    public Difficulty findDifficulty(int id);
    
    public void save(Difficulty difficulty);
    
    public Map<Integer, Integer> getHomeMap();

    public Map<Integer, Integer> getAwayMap();
    
    public List<Difficulty> findByHome(int id);

	public List<Object> rand();
    
}