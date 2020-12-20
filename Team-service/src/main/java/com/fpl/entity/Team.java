package com.fpl.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="all_teams")
public class Team {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
    private int id;
	
	@Column(name="Team")
	private String team;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="difficulty")
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
