package com.fpl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpl.entity.Difficulty;

public interface DifficultyRepository extends JpaRepository<Difficulty, Integer>{

	public List<Difficulty> findByHome(int home);
	

}