package com.fpl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fpl.repository.TeamRepository;

@Service
public class TeamService {

    private TeamRepository teamRepository;

    public TeamService(TeamRepository repository){
        this.teamRepository = repository;
    }
    
    public void save(Team team) {
    	teamRepository.save(team);
    }

    public Team findTeam(long id) {
        Optional<Team> team = teamRepository.findById(id);
        if(team != null){
            return team.get();
        }
        return null;
    }

    public List<Team> findAll(){
    	return teamRepository.findAll();
    }

}
