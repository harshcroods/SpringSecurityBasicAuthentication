package com.croods.springsecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.croods.springsecurity.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
