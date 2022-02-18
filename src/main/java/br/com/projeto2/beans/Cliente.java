package br.com.projeto2.beans;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

@Entity
@SequenceGenerator(allocationSize = 1, name = "pessoa", sequenceName = "sq_pessoa")
public class Cliente {


	
	public Cliente() {}

	@Id
	@GeneratedValue(generator = "cliente", strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long id;

	@OneToMany(mappedBy = "cliente")
	private List<Produto> listCarinho = new ArrayList<Produto>();


	private String nome;
	private String cpf;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;

	private String senha;
	private String email;


	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Produto> getListCarinho() {
		return listCarinho;
	}

	public void setListCarinho(List<Produto> listCarinho) {
		this.listCarinho = listCarinho;
	}
}
