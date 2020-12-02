package com.fpl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "all_fixtures")
public class Fixture {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
    private int id;
	
	@Column(name="home")
    private int home;
	
	@Column(name="away")
    private int away;
	
	@Column(name="gameweek")
    private int gameweek;


    public Fixture() {
    }

    public Fixture(int id, int home, int away, int gameWeek) {
        this.id = id;
        this.home = home;
        this.away = away;
        this.gameweek = gameWeek;
    }

    public Fixture(int home, int away, int gameWeek) {
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