package br.com.projeto2.controller;

import java.util.List;
import java.util.Optional;

import br.com.projeto2.beans.Compra;
import br.com.projeto2.beans.Produto;
import br.com.projeto2.repository.CompraRepository;
import br.com.projeto2.repository.ProdutoRepository;
import br.com.projeto2.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import br.com.projeto2.beans.Cliente;
import br.com.projeto2.repository.ClienteRepository;
import br.com.projeto2.service.ClienteService;

@Controller
public class ExibeController {
	
	@Autowired
	ClienteRepository cR;

	@Autowired
	ProdutoRepository pR;

	@Autowired
	ClienteService sR;

	@Autowired
	CompraRepository compraR;

	@Autowired
	CompraService compraS;
	







//	@GetMapping("t1/{id_produto}")
//	public ModelAndView addCarinho(@PathVariable("id_produto") Long id){
//		ModelAndView mv = new ModelAndView("t1");
//			Cliente c = this.cR.getById(1L);
//			Produto p = this.pR.getById(1L);
//			Produto p3 = this.pR.getById(id);
//		c.getListCarinho().add(p);
//		c.getListCarinho().add(p3);
//		for(Produto p2 : c.getListCarinho()){
//				System.out.println(p2.getDescricao());
//			}
//			mv.addObject("produtos", c.getListCarinho());
//		return mv;
//	}







	
	
//	@GetMapping("/index")
//	public String listar(Model model) {
//	    model.addAttribute("clientes", cR.findAll());
//	    return "index";
//	}
	
}
	


