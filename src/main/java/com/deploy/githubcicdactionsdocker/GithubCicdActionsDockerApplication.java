package com.deploy.githubcicdactionsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsDockerApplication {

	@GetMapping("/welcome")
	public String Welcome(){
		return "Welcome Dinoshna!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsDockerApplication.class, args);
	}

}
