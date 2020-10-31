package com.fpl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fpl.entity.Difficulty;


@RestController
public class DifficultyController {

	@Autowired
	RestTemplate restTemplate;
	
	private static List<Difficulty> diffList = new ArrayList<>();
    static {
    	diffList.add(new Difficulty("y-1"));
    	diffList.add(new Difficulty( "summary-2"));
    	diffList.add(new Difficulty("summary-3"));
    }

    @GetMapping("/test")
    public ResponseEntity<?> getMovies() {
        return ResponseEntity.ok(diffList);
    }
	
}
