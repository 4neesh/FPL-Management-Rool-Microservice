package main.java.com.fpl.controller;

import com.fpl.service.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {

    private TeamService teamService;

    public TeamController(TeamService teamServiceArg){
        teamServiceArg = teamService;
    }

    private List<main.java.com.fpl.service.Team> fixtures;


    @GetMapping("/getFixture/{id}")
    public main.java.com.fpl.service.Team getFixture(@PathVariable int id ) {
        return teamService.findTeam(id);
    }

    @GetMapping("/getFixtures")
    public List<main.java.com.fpl.service.Team> getTeams(){
        fixtures = teamService.findAll();
        return fixtures;
    }

    @PostMapping("/addFixture")
    public String addFixture(@RequestBody main.java.com.fpl.service.Team fixture) {
        teamService.save(fixture);
        return fixture.toString();
    }
}
