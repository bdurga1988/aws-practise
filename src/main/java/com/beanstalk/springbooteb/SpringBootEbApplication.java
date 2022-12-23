package com.beanstalk.springbooteb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootEbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEbApplication.class, args);
	}

	@GetMapping("/")
	public String sendMsg(){
		return "Hello Durga, welcome to Elastic Beanstalk";
	}

}
