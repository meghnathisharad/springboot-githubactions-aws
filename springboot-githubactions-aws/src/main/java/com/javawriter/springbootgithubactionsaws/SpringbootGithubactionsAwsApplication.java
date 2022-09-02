package com.javawriter.springbootgithubactionsaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGithubactionsAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGithubactionsAwsApplication.class, args);
	}

	@GetMapping("/welcome")
	public String greetings(){
		return "Welcome to the world !!";
	}
}
