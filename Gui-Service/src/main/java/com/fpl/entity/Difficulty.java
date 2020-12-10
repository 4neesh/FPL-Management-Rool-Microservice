package com.fpl.entity;

public class Difficulty {

    private int id;
	private Team team;
	private int home;
	private int away;


	public Team getTeam() {
		return team;
	}


	public void setTeam(Team team) {
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


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Difficulty [id=" + id + ", team=" + team + ", home=" + home + ", away=" + away + "]";
	}
	
}
