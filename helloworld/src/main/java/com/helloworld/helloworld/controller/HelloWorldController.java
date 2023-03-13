package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world") //essa linha informa o endereço http 

public class HelloWorldController {
	
	
	@GetMapping //pega a info que vai ser exibida
	public String helloWorld() {
		return "Hello World!!!";
	}


	@GetMapping ("/bsm-gen")
	public String bsm() {
		return "Persistência, Mentalidade de Crescimento, Orientação ao futuro, "
				+ "Responsabilidade pessoal, Comunicação, Proatividade, "
				+ "Orientação ao detalhe, Trabalho em equipe.";
		
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Dominar a base de Spring,"
				+ " finalizar um projeto iniciado no final de semana.";
	}
	
	
}
