package com.fpl.allEntity;

import javax.persistence.*;

@Entity
@Table(name = "all_fixtures")
public class AllFixture {

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


    public AllFixture() {
    }

    public AllFixture(int id, int home, int away, int gameWeek) {
        this.id = id;
        this.home = home;
        this.away = away;
        this.gameweek = gameWeek;
    }

    public AllFixture(int home, int away, int gameWeek) {
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