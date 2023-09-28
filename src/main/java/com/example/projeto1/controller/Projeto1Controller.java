package com.example.projeto1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projeto1")
public class Projeto1Controller {

	@GetMapping
	public String listaBsm() {
		return "Persistencia \n"+
				"Mentalidade de crescimento \n"+
				"Orientação ao futuro \n" +
				"Responsabilidade pessoal \n"+
				"Trabalho em equipe \n"+
				"Comunicação \n"+
				"Orientação aos detalhes \n"+
				"Proatividade";
	}
	
}
