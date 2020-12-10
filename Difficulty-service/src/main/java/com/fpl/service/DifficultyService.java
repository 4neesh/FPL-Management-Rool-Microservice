package com.fpl.service;

import java.util.List;

import com.fpl.entity.Difficulty;

public interface DifficultyService {
				
    public List<Difficulty> findAll();

    public Difficulty findDifficulty(int id);
    
    public void save(Difficulty difficulty);
        
    
}