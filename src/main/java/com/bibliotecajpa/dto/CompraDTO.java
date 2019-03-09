package com.bibliotecajpa.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CompraDTO {

    @NotNull
    @NotEmpty
    private String nome;
    private int quantidade;

    public CompraDTO(){

    }
    public CompraDTO(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
