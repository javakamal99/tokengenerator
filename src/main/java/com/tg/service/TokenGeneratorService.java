package com.tg.service;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TokenGeneratorService {

	public static void main(String[] args) {
		SpringApplication.run(TokenGeneratorService.class, args);
		
		Random random = new Random();

		// Generate a random integer between 1 and 100
		int randomNumber = random.nextInt(100) + 1;

		// Print the random number to the console
		System.out.println("Random number: " + randomNumber);

	}

}
