package com.github.leovd100.starwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
public class StarwarsApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(StarwarsApiApplication.class, args);
	}
}
