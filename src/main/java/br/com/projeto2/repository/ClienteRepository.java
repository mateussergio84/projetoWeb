package br.com.projeto2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto2.beans.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
