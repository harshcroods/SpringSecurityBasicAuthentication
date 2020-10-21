package com.croods.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.croods.springsecurity.entity.Student;
import com.croods.springsecurity.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/all")
	public List<Student> getAllStudent() {
		System.err.println("Inside Student");
		List<Student> stuList = studentService.getAllStudent();
		return stuList;
	}

}
