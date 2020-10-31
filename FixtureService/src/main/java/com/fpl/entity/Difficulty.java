package com.fpl.entity;

import org.springframework.stereotype.Component;

@Component
public class Difficulty {

	public Difficulty(String team) {
		this.team = team;
	}
	
	public Difficulty() {
		
	}
	private String team;
	
	@Override
	public String toString() {
		return "Difficulty [team=" + team + "]";
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	
}
