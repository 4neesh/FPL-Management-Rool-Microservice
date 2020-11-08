package com.fpl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuiController {

	
	@GetMapping("/")
	public String getHome() {
		return "home";
	}
	
	@GetMapping("/fixtures")
	public String getFixtures() {
		return "fixtures";
	}
	
}
