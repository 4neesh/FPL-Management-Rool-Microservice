package com.fpl.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "all_fixtures")
public class Fixture {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
    private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="home")
    private Team home;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="away")
    private Team away;
	
	@Column(name="gameweek")
    private int gameweek;


    public Fixture() {
    }

    public Fixture(int id, Team home, Team away, int gameWeek) {
        this.id = id;
        this.home = home;
        this.away = away;
        this.gameweek = gameWeek;
    }

    public Fixture(Team home, Team away, int gameWeek) {
        this.home = home;
        this.away = away;
        this.gameweek = gameWeek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }



    public int getGameweek() {
        return gameweek;
    }

    public void setGameweek(int gameweek) {
        this.gameweek = gameweek;
    }

    @Override
    public String toString() {
        return "Fixture{" +
                "id=" + id +
                ", home=" + home +
                ", away=" + away +
                ", gameweek=" + gameweek +
                '}';
    }

}