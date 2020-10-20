package com.croods.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController {

	@GetMapping("/user")
	public ModelAndView returnPage() {
		System.err.println("---------------USERS---------------");
		return new ModelAndView("all");
	}
}
