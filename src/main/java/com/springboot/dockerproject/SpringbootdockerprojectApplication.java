package com.springboot.dockerproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootdockerprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdockerprojectApplication.class, args);
		System.out.println("Hello World Docker Image");
		System.out.println("Hi I am learning Docker");
	}

}
