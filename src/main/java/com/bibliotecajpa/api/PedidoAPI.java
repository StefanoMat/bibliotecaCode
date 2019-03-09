package com.bibliotecajpa.api;

import com.bibliotecajpa.dto.CompraDTO;
import com.bibliotecajpa.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoAPI {

    @Autowired
    private CompraService compraService;

    @PostMapping("/compras")
    private ResponseEntity<?> ordemDeCompra(@RequestBody CompraDTO compraDTO){
        return ResponseEntity.ok(compraService.ordemDeCompra(compraDTO));

    }
}
