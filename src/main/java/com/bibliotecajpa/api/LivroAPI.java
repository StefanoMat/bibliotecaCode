package com.bibliotecajpa.api;

import com.bibliotecajpa.dto.CompraDTO;
import com.bibliotecajpa.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bibliotecajpa.dto.LivroDTO;
import com.bibliotecajpa.service.LivroService;

@RestController()
public class LivroAPI {

	@Autowired
	private LivroService livroService;

	@Autowired
	private CompraService compraService;
	
	@GetMapping("/livros")
	private ResponseEntity<?> buscarTodosLivros() {
		return ResponseEntity.ok(livroService.buscarTodosLivros());
	}
	
	@PostMapping("/livros")
	private ResponseEntity<?> insereLivro(@RequestBody LivroDTO livroDTO) {
		return ResponseEntity.ok(livroService.insereLivro(livroDTO));
	}

	@GetMapping("/livros/{nome}")
	private ResponseEntity<?> buscarLivroPorNome(@PathVariable String nome) {
		return ResponseEntity.ok(livroService.buscarLivroPorNome(nome));
	}

	@DeleteMapping("/livros/{id}")
	private ResponseEntity<?> deletarLivroPorId(@PathVariable Long id) {
		try {
			livroService.deletarLivroPorId(id);
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}



	
}
