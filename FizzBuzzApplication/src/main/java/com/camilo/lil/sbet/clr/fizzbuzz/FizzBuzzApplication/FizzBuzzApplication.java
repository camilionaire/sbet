package com.camilo.lil.sbet.clr.fizzbuzz.FizzBuzzApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzBuzzApplication {

	@Bean
	public CommandLineRunner run() {
		return args -> {
			for (int i = 0; i <= 100; ++i) {
				String result = "";
				result += (i % 3) == 0 ? "Fizz" : "";
				result += (i % 5) == 0 ? "Buzz" : "";
				System.out.println(!result.isEmpty() ? result : i);
			}
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}

}
