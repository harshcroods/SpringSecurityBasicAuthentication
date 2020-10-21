package com.croods.springsecurity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croods.springsecurity.entity.Student;
import com.croods.springsecurity.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	private static long idCounter = 0;
	private static List<Student> studentList = new ArrayList<Student>();

	static {
		studentList.add(new Student(++idCounter, "Harsh"));
		studentList.add(new Student(++idCounter, "Parth"));
		studentList.add(new Student(++idCounter, "Rahin"));

	}

	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

}
