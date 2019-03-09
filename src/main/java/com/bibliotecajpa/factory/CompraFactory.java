package com.bibliotecajpa.factory;

import com.bibliotecajpa.dto.CompraDTO;
import com.bibliotecajpa.dto.LivroDTO;
import com.bibliotecajpa.model.Compra;
import org.springframework.stereotype.Component;

@Component
public class CompraFactory {

    public CompraDTO getInstance(Compra compra){
        CompraDTO compraDTO = new CompraDTO();
        compraDTO.setNome(compra.getNomeLivro());
        compraDTO.setQuantidade(compra.getQuantidade());

        return compraDTO;

    }

    public Compra getInstanceFromDTO(CompraDTO compraDTO){
        Compra compra = new Compra();
        compra.setNomeLivro(compraDTO.getNome());
        compra.setQuantidade(compraDTO.getQuantidade());

        return compra;
    }



}
