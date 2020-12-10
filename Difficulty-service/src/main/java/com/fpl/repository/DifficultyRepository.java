package com.fpl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fpl.entity.Difficulty;

public interface DifficultyRepository extends JpaRepository<Difficulty, Integer>{

	public List<Difficulty> findByHome(int home);
	
	@Query("SELECT e.team.team, e.home FROM Difficulty e where e.home =2")
	public List<Object> difficultyQuery();
	
	@Query("SELECT e.team.team, e.home FROM Difficulty e where e.home =2")
	public List<String> difficultyQuery2();

}