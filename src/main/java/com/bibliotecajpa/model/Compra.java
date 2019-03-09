package com.bibliotecajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "ordem_compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeLivro;
    private int quantidade;

    public Compra(){

    }
    public Compra(String nomeLivro, int quantidade){
        this.nomeLivro = nomeLivro;
        this.quantidade = quantidade;

    }


    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

