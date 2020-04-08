package com.saran.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaranController {
	@GetMapping("/")
	public String getMessage() {
		return "Welcome to SpgBootGitJenkinsIntegration";
	}

}
