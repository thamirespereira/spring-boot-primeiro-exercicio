package com.example.projeto1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world2")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!!!!!!!!" ;
	}

	}