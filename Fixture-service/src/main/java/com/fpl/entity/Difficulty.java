package com.fpl.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="all_difficulty")
public class Difficulty {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
    private int id;

	@Column(name="team") 
	private int team;

	@Column(name="Home")
	private int home;


	@Column(name="Away")
	private int away;


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


	public int getTeam() {
		return team;
	}


	public void setTeam(int team) {
		this.team = team;
	}



}
