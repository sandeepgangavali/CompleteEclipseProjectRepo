package com.itcinfotech.moviecruiserapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.itcinfotech.moviecruiserapp.*")
public class MovieCruiserAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCruiserAppApplication.class, args);
	}

}
