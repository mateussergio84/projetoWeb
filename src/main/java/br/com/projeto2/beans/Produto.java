package br.com.projeto2.beans;

import javax.persistence.*;

@Entity
public class Produto {


    @ManyToOne
    @JoinColumn(name = "cliente_id_cliente")
    private Cliente cliente;

    public Produto() {
    }

    public Produto(String cod, String descricao, String categoria, byte[] imagem, Double preco) {
        super();
        this.cod = cod;
        this.descricao = descricao;
        this.categoria = categoria;
        this.imagem = imagem;
        this.preco = preco;
    }

    @Id
    @GeneratedValue(generator = "produto", strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long id;

    private String cod;

    @Column(name = "ds_produto")
    private String descricao;

    private String categoria;

    @Lob
    private byte[] imagem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Double preco;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }


}
