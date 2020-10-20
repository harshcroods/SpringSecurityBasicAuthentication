package com.croods.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityBasicAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicAuthApplication.class, args);
		System.out.println("Application Started... Have a Great Day :)");
	}

}
