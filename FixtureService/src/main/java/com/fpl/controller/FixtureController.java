package com.fpl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fpl.entity.Difficulty;

@RestController
public class FixtureController {

	
	@GetMapping("/test")
	public String test() {
		return "TEST";
	}
	
	@Autowired
	RestTemplate restTemplate;

    @RequestMapping(value = "/link", method = RequestMethod.GET)
    @ResponseBody
    public Difficulty[] recommendations() {
        Difficulty[] result = restTemplate.getForObject("http://difficulty-details/test", Difficulty[].class);
        return result;
    }
    
}
