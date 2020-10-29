package com.fpl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FixtureController {

	
	@GetMapping("/test")
	public String test() {
		return "TEST";
	}
}
