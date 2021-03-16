package com.helloworld2.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivos")
public class Hello2Controller {
	
	@GetMapping
	public String objetivos () {
		return "Objetivos da semana: Aprender Spring Boot";
	}

}
