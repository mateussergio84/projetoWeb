package br.com.projeto2.service;

import java.util.List;

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
	
	public List<Cliente> findAll() {
        return cR.findAll();
    }
	
	public Cliente getClienteId(long id) {
		return cR.findById(id).get();
	}
	
}
