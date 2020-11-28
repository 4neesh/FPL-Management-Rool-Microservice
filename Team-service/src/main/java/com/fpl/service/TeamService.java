package com.fpl.service;

import com.fpl.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamService {

    private TeamRepository teamRepository;

    public TeamService(TeamRepository repository){
        this.teamRepository = repository;
    }

    public main.java.com.fpl.service.Team findTeam(long id) {
        Optional<main.java.com.fpl.service.Team> team = teamRepository.findById(id);
        if(team != null){
            return team.get();
        }
        return null;
    }


}
