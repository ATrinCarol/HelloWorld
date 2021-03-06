package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") 
public class HelloController {
	
	@GetMapping
	public String helloWorld () {
		return "<h1><b>Seguindo a tradição:</h1></b><br /> Hello World!!!";
	}

	@GetMapping ("/bsm")
	public String bsm () {
		return "<h1><b>BSM's Generation Brasil</h1></b><br /> <b>Mentalidades:</b><br />"
				+ "Orientação ao futuro<br />Responsabilidade pessoal<br />"
				+ "Mentalidade de crescimento<br />Persistência<br /><br />"
				+ "<b>Habilidades:</b><br />Trabalho em equipe<br />"
				+ "Orientação ao detalhe<br />Proatividade<br />Comunicação";
	}
	
	@GetMapping ("/objetivo")
	public String objetivo () {
		return "<h1><b>Objetivos de aprendizagem dessa semana (23-27/Maio/2022):</h1></b><br />"
				+ " <b>O objetivo é aprender sobre:</b><br /><br /> - MySQL e Bancos de Dados Relacionais<br />"
				+ "- Fixar o CRUD: Create, Read, Update, Delete<br />"
				+ "- Modelo Entidade Relacional - MER e Diagrama Entidade Relacional - Der<br />"
				+ "- Spring Tool Suite - STS";
		
	}
	
}