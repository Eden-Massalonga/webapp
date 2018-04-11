package com.aprendizado.webapp.controllers.cadastro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cadastroController {
	@RequestMapping("/cadastro")
	public String cadastrar() {
		return "cadastros/indexCadastro";
		
	}
}
