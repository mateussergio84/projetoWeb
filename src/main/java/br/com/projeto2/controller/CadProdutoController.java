package br.com.projeto2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.projeto2.beans.Produto;
import br.com.projeto2.service.ProdutoService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class CadProdutoController {
	
	@Autowired
	ProdutoService pS;
	
	@RequestMapping(value = "/cadProduto", method = RequestMethod.GET)
	public String form() {
		return "CadastroProduto";
	}


	@PostMapping("cadProduto")
	public String salvar(Produto produto, @RequestParam("fileProduto") MultipartFile file) {
		try {
			produto.setImagem(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		pS.create(produto);
		return "/cadastroProduto";
	}

//	@RequestMapping(value = "/cadProduto", method = RequestMethod.POST)
//	public String form(Produto produto) {
//	    pS.create(produto);
//		return "/Home";
//	}

}
