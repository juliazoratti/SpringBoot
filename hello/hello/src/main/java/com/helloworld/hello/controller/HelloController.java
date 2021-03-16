package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Mentalidades e Habilidades")
public class HelloController {
	
	@GetMapping
	public String mentalidades () {
		return "Mentalidades e Habilidades usadas: Persistencia e atenção aos detalhes";
	}

}
