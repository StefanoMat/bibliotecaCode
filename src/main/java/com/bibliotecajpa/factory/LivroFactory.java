package com.bibliotecajpa.factory;

import org.springframework.stereotype.Component;

import com.bibliotecajpa.dto.LivroDTO;
import com.bibliotecajpa.model.Livro;

@Component
public class LivroFactory {

	public LivroDTO getInstance(Livro livro) {
		LivroDTO livroDTO = new LivroDTO();

		livroDTO.setNome(livro.getNome());
		livroDTO.setDescricao(livro.getDescricao());
		livroDTO.setAutor(livro.getAutor());
		livro.setEditora(livroDTO.getEditora());
		livroDTO.setPreco(livro.getPreco());

		return livroDTO;
	}
	
	public Livro getInstance(LivroDTO livroDTO) {
		if (livroDTO.getNome() == null) {
			throw new IllegalArgumentException("Campo nome não pode ser nulo.");
		}
		
		if (livroDTO.getNome().isEmpty()) {
			throw new IllegalArgumentException("Campo nome não pode ser vazio.");
		}

		if (livroDTO.getPreco() == null){
			throw new IllegalArgumentException("Campo preço não pode ser nulo");
		}


		
		Livro livro = new Livro();
		livro.setNome(livroDTO.getNome());
		livro.setDescricao(livroDTO.getDescricao());
		livro.setAutor(livroDTO.getAutor());
		livro.setEditora(livroDTO.getEditora());
		return livro;
	}

}
