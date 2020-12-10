package com.fpl.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fpl.service.Team;
import com.fpl.service.TeamService;

@RestController
public class TeamController {

    private TeamService teamService;

    public TeamController(TeamService teamServiceArg){
        teamServiceArg = teamService;
    }

    private List<Team> fixtures;


    @GetMapping("/getTeam/{id}")
    public Team getFixture(@PathVariable int id ) {
        return teamService.findTeam(id);
    }

    @GetMapping("/getTeams")
    public List<Team> getTeams(){
        fixtures = teamService.findAll();
        return fixtures;
    }

    @PostMapping("/addTeam")
    public String addFixture(@RequestBody Team fixture) {
        teamService.save(fixture);
        return fixture.toString();
    }
}
