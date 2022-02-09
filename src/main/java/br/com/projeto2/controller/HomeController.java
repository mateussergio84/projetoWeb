package br.com.projeto2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	public String form() {
		return "home";
	}

}
