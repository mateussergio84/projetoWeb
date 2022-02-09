package br.com.projeto2.beans;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(allocationSize = 1, name = "compra", sequenceName = "sq_compra")
public class Compra {
	

	public Compra(Produto produto, Cliente cliente) {
		super();
		this.produto = produto;
		this.dataCompra = Calendar.getInstance();
		this.cliente = cliente;
	}
	@Id
	@GeneratedValue(generator = "compra", strategy = GenerationType.IDENTITY)
	@Column(name = "id_compra")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;
	private Calendar dataCompra;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Calendar getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	
	
	
	

}
