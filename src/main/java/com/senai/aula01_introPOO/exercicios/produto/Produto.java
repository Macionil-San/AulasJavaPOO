package com.senai.aula01_introPOO.exercicios.produto;

public class Produto {
    String nome;
    float preco;
    int quantidade;


    @Override
    public String toString() {
        return "nome: " + nome + ", preço: " + preco + ", quantidade no estoque: " + quantidade;
    }

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
