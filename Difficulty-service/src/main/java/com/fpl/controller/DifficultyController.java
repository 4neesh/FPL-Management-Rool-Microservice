package com.fpl.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fpl.entity.Difficulty;
import com.fpl.entity.DifficultyJoin;
import com.fpl.service.DifficultyService;

@RestController
public class DifficultyController {

	private DifficultyService service;
	
	public DifficultyController(DifficultyService service) {
		this.service = service;
	}
	
	@PostMapping("/add-difficulty")
	public String addDifficulty(@RequestBody Difficulty difficulty) {
		
		service.save(difficulty);
		return difficulty.toString();
	}
	
	@GetMapping("/get-difficulties")
	public List<Difficulty> getDifficulties(){
		return service.findAll();
	}
	
	@GetMapping("/getJoinDifficulty")
	public List<DifficultyJoin> getJoinDifficulties(){
		return service.findJoinDifficulty();
	}
	
	
	
}