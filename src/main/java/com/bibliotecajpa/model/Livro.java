package com.bibliotecajpa.model;

import com.bibliotecajpa.dto.LivroDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private String autor;
	private String editora;
	private Long preco;

	public Livro() {
		
	}
	
	public Livro(String nome) {
		this.nome = nome;
	}

	public Livro(String nome, String descricao, String autor, String editora, Long preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.autor = autor;
		this.editora = editora;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Long getPreco(){
		return preco;
	}
	public void setPreco(Long preco){
		this.preco = preco;
	}



}
