package br.com.projeto2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto2.beans.Produto;
import br.com.projeto2.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository pR;
	
	public Produto create(Produto p) {
		return pR.save(p);
	}

}
