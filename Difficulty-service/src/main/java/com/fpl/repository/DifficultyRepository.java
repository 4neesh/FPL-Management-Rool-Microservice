package com.fpl.repository;

import com.fpl.allEntity.AllDifficulty;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fpl.entity.Difficulty;

public interface DifficultyRepository extends JpaRepository<AllDifficulty, Integer>{

}