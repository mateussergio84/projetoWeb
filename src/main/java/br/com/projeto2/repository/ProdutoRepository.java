package br.com.projeto2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto2.beans.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
