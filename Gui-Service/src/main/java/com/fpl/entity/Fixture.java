package com.fpl.entity;

public class Fixture {

    private int id;
    private String home;
    private String away;
    private int gameweek;


    public Fixture() {
    }

    public Fixture(int id, String home, String away, int gameWeek) {
        this.id = id;
        this.home = home;
        this.away = away;
        this.gameweek = gameWeek;
    }

    public Fixture(String home, String away, int gameWeek) {
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

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
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