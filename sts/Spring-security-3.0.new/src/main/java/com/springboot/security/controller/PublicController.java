package com.springboot.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {
	@GetMapping("/home")
	public String home() {
		return "thids is a home page;";
	}

	@GetMapping("/login")
	public String login() {
		return "this is a login page";
	}
}
