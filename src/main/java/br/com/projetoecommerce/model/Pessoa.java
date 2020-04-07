package br.com.projetoecommerce.model;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	private Endereco endereco;
	
	public Pessoa(String nome, String sobrenome, Date dataNascimento, Endereco endereco) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}
	

	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
		

}
