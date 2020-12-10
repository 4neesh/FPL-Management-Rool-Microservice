package com.fpl.service;

import java.util.List;

import com.fpl.entity.Team;

public interface TeamService {
	
	void save(Team team);
	
	Team findTeam(int i);
	
	List<Team> findAll();

}
