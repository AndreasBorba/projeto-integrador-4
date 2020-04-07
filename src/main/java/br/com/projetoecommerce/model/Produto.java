package br.com.projetoecommerce.model;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	private BigDecimal preco;
	private String descricao;
	private int quantidade;
	private int quantidadeCompra;
	
	public Produto(String nome, BigDecimal preco, String descricao, int quantidade, int quantidadeCompra){
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.quantidadeCompra = quantidadeCompra;	
	}

	public int getQuantidadeCompra() {
		return quantidadeCompra;
	}



	public void setQuantidadeCompra(int quantidadeCompra) {
		this.quantidadeCompra = quantidadeCompra;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void incrementaQuantidade() {
		this.quantidadeCompra++;
	}
	
}
