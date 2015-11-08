package de.mschneid.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final String GREETING_MESSAGE = "Greetings from Spring Boot";

	@RequestMapping("/")
	public String index() {
		return GREETING_MESSAGE;
	}

}
