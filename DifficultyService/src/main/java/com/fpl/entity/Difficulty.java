package com.fpl.entity;


public class Difficulty {

	public Difficulty(String team) {
		this.team = team;
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
