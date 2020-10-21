package com.croods.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/securitynone")
public class NoSecurityController {
	
	@GetMapping("")
	public void helloWorld() {
		System.err.println("----------------HELLO WORLD--------------");
	}
}
