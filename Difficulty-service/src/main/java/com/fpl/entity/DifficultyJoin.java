package com.fpl.entity;

public class DifficultyJoin {

	private String team;
	
	private int home;
	
	private int away;
	
	
	public DifficultyJoin(String team, int home, int away) {
		super();
		this.team = team;
		this.home = home;
		this.away = away;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getHome() {
		return home;
	}

	public void setHome(int home) {
		this.home = home;
	}

	public int getAway() {
		return away;
	}

	public void setAway(int away) {
		this.away = away;
	}
	
	
}
