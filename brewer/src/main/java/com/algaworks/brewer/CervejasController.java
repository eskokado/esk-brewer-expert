package com.algaworks.brewer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.algaworks.brewer.model.Cerveja;

@Controller
public class CervejasController {

	@GetMapping("/cervejas/novo")
	public String novo() {
		return "cerveja/CadastroCerveja";
	}

	@PostMapping("/cervejas/novo")
	public String cadastrar(Cerveja cerveja) {
		System.out.println("Chamou Cadastrar ---> " + cerveja.getSku());
		return "cerveja/CadastroCerveja";
	}
	
}
