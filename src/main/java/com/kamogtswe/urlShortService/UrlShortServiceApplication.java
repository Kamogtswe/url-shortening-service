package com.kamogtswe.urlShortService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UrlShortServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrlShortServiceApplication.class, args);
	}

	@GetMapping("/")
	public String helloWorld(@RequestParam
	(value = "name", defaultValue = "World") String name)
	{
		return String.format("Hello %s!", name);
	}

}
