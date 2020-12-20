package com.fpl.entity;


public class Team {

    private int id;
	
	private String team;

	private Difficulty difficulty;
	
	
	
	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getId() {
		return id;
	}
	
	
	
}
