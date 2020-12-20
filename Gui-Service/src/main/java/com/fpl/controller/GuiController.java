package com.fpl.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.fpl.entity.Difficulty;
import com.fpl.entity.Fixture;
import com.fpl.entity.Team;

@Controller
public class GuiController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/")
	public String getHome() {
		return "home";
	}


	@GetMapping("/fixtures")
	public String getFixtures(Model model) {

		Fixture[] fixtures = restTemplate.getForObject("http://fixtureService/getFixtures", Fixture[].class);
		Difficulty[] difficulties = restTemplate.getForObject("http://difficultyService/get-difficulties", Difficulty[].class);

		Map<Integer, Integer> homeMap = new HashMap<>();
		Map<Integer, Integer> awayMap = new HashMap<>();

		for(Difficulty t : difficulties) {
			homeMap.put(t.getId(), t.getHome());
			awayMap.put(t.getId(), t.getAway());

		}
		model.addAttribute("fixtures", fixtures);
		model.addAttribute("homeMap", homeMap);
		model.addAttribute("awayMap", awayMap);

		return "fixtures";
	}
	
}
