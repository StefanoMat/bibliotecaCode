package com.bibliotecajpa.service;

import com.bibliotecajpa.dto.CompraDTO;
import com.bibliotecajpa.factory.CompraFactory;
import com.bibliotecajpa.model.Compra;
import com.bibliotecajpa.repository.CompraRepository;
import com.bibliotecajpa.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {

    @Autowired
    private CompraFactory compraFactory;

    @Autowired
    private CompraRepository compraRepository;

    public CompraDTO ordemDeCompra(CompraDTO compraDTO){
        Compra compra;
        compra = compraFactory.getInstanceFromDTO(compraDTO);
        Compra compra2;
        compra2 = compraRepository.save(compra);
        return compraFactory.getInstance(compra2);
    }
}
