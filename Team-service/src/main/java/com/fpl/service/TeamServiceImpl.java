package com.fpl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpl.entity.Team;
import com.fpl.repository.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService {

    private TeamRepository teamRepository;
    
    @Autowired
    public TeamServiceImpl(TeamRepository repo) {
    	this.teamRepository = repo;
    }
    
    public void save(Team team) {
    	teamRepository.save(team);
    }

    public Team findTeam(int id) {
        Optional<Team> team = teamRepository.findById(id);
        if(team != null){
            return team.get();
        }
        return null;
    }

    public List<Team> findAll(){

    	List<Team> list = teamRepository.findAll();
    	return list;
    }


}
