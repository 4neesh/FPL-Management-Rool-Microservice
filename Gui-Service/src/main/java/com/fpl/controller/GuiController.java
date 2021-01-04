package com.fpl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

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
		model.addAttribute("fixtures", fixtures);

		return "fixtures";
	}
	
	@GetMapping("/difficulties")
	public String getDifficulties(Model model) {

		Team[] teams = restTemplate.getForObject("http://teamService/getTeams", Team[].class);
		model.addAttribute("teams", teams);

		return "difficulties";
	}
	
}
