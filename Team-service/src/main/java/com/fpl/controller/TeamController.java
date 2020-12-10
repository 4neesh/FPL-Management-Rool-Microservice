package com.fpl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fpl.entity.Team;
import com.fpl.service.TeamService;

@RestController
public class TeamController {

    private TeamService teamService;

    @Autowired
    public TeamController(TeamService teamServiceArg){
        teamServiceArg = teamService;
    }
    
    private List<Team> teams;

    @GetMapping("/te")
    public String get() {
    	System.out.println("LO");
    	return "LO";
    }

    @GetMapping("/getTeam/{id}")
    public Team getTeam(@PathVariable int id ) {
        return teamService.findTeam(id);
    }

    @GetMapping("/getTeams")
    public List<Team> getTeams(){
    	teams = teamService.findAll();
        return teams;
       
    }

    @PostMapping("/addTeam")
    public String addFixture(@RequestBody Team fixture) {
        teamService.save(fixture);
        return fixture.toString();
    }
}
