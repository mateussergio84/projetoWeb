package br.com.projeto2.controller;

import br.com.projeto2.beans.Produto;
import br.com.projeto2.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

	@Autowired
	ProdutoRepository pR;
	
//	@RequestMapping(value = "/home", method = RequestMethod.GET)
//	public String form() {
//		return "home";
//	}

	@GetMapping("/home")
	public ModelAndView listaP(){
		ModelAndView mv = new ModelAndView("home");
		List<Produto> produtos = pR.findAll();
		mv.addObject("produtos", produtos);
		return mv;
	}

	@GetMapping("home/img/{id_produto}")
	@ResponseBody
	public byte[] exibe(@PathVariable("id_produto") Long id){
		Produto p = this.pR.getById(id);
		return p.getImagem();
	}

}
