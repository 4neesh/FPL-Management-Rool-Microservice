package com.fpl.service;

import java.util.List;
import java.util.Map;

import com.fpl.allEntity.AllDifficulty;
import com.fpl.entity.Difficulty;

public interface DifficultyService {
				
    public List<AllDifficulty> findAll();

    public AllDifficulty findDifficulty(int id);
    
    public void save(AllDifficulty difficulty);
    
    public Map<Integer, Integer> getHomeMap();

    public Map<Integer, Integer> getAwayMap();

    
}