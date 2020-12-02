package com.fpl.controller;

import java.util.List;

import com.fpl.entity.Difficulty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
	@ResponseBody
	public List<Difficulty> getDifficulties(){
		return service.findAll();
	}
	
	
}