package com.fpl.entity;


import javax.persistence.*;

@Entity
@Table(name="all_difficulty")
public class Difficulty {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
    private int id;


	@Column(name="Team")
	private int team;

	@Column(name="Home")
	private int home;


	@Column(name="Away")
	private int away;


	public int getTeam() {
		return team;
	}


	public void setTeam(int team) {
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
