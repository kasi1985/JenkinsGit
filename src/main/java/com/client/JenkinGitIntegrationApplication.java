package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("jenkinGit")
public class JenkinGitIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinGitIntegrationApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, welcome!!!!";
	}

}
