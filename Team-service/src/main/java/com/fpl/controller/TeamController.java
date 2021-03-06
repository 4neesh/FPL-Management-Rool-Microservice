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
	
	@Autowired
    private TeamService teamService;

    @GetMapping("/getTeam/{id}")
    public Team getTeam(@PathVariable int id ) {
        return teamService.findTeam(id);
    }

    @GetMapping("/getTeams")
    public List<Team> getTeams(){
        return teamService.findAll();
       
    }

    @PostMapping("/addTeam")
    public String addFixture(@RequestBody Team fixture) {
        teamService.save(fixture);
        return fixture.toString();
    }
}
