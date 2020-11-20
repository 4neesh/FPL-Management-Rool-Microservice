package com.fpl.controller;

import com.fpl.entity.Fixture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

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
	
}
