package br.com.projeto2.beans;

import org.springframework.stereotype.Indexed;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@SequenceGenerator(allocationSize = 1, name = "compra", sequenceName = "sq_compra")
public class Compra {


	public Compra() {
	}

	public Compra(Produto produto, Cliente cliente) {
		super();
		this.produto = produto;
		this.cliente = cliente;
		this.dataCompra = Calendar.getInstance();
	}

	@Id
	@GeneratedValue(generator = "compra", strategy = GenerationType.IDENTITY)
	@Column(name = "id_compra")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;
	private Calendar dataCompra;
	


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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
