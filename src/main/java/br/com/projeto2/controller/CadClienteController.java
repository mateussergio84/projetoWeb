package br.com.projeto2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.projeto2.beans.Cliente;
import br.com.projeto2.service.ClienteService;

@Controller
public class CadClienteController {
	
	
	@Autowired
	ClienteService cS;
	
	@RequestMapping(value = "/cad", method = RequestMethod.GET)
	public String form() {
		return "CadastroCliente";
	}

	@RequestMapping(value = "/cad", method = RequestMethod.POST)
	public String form(Cliente cliente) {
	    cS.create(cliente);
		return "/home";
	}

}
