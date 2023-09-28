package com.example.projeto1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController {

	@GetMapping
	public String objetivo() {
		return "Objetivo da semana: \n" +
				"Aprender Spring Boot";
}
}
