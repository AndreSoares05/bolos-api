package com.exemplo.bolos.model;

// representa um Bolo dentro do sistema
public class Bolo {

    private Long id;
    private String nome;
    private String sabor;
    private double preco;

    public Bolo() {
    }

    public Bolo(Long id, String nome, String sabor, double preco) {
        this.id = id;
        this.nome = nome;
        this.sabor = sabor;
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

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
