package com.docker.spring_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerApplication {

	@GetMapping
	public String getMessage(){
		return "Welcome to Docker and CICD";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

}
