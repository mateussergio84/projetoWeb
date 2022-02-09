package br.com.projeto2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto2.beans.Cliente;
import br.com.projeto2.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository cR;
	
	public Cliente create(Cliente c) {
		return cR.save(c);
	}
}
