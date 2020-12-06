package com.fpl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fpl.entity.Difficulty;
import com.fpl.entity.DifficultyJoin;

public interface DifficultyRepository extends JpaRepository<Difficulty, Integer>{

	
	@Query("SELECT all_teams.team, all_difficulty.home, all_difficulty.away " + 
			"FROM all_difficulty " + 
			"inner join all_teams " + 
			"on " + 
			"all_difficulty.TEAM = all_teams.Id")
	public List<DifficultyJoin> findDifficultyJoin();
	
}