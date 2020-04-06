package br.com.projetoecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaInicialController {
	
	@GetMapping(value="/index")
	public String paginaInicial() {
		return "index";
	}
	@GetMapping(value="/form")
	public String formCadastro() {
		return "/form";
	}

}
