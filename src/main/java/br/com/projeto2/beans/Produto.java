package br.com.projeto2.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	


	public Produto(Long cod, String descricao, Categoria categoria, Double preco) {
		super();
		this.cod = cod;
		this.descricao = descricao;
		this.categoria = categoria;
		this.preco = preco;
	}

	@Id
	@GeneratedValue(generator = "produto", strategy = GenerationType.IDENTITY)
	@Column(name="id_produto")
	private Long id;
	
	private Long cod;
	
	@Column(name="ds_produto")
	private String descricao;
	
	private Categoria categoria;
	
	private Double preco;


	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
