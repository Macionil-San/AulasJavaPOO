package com.senai.aula03_encapsulamento.exercicios.exercicio01.cadastro;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {                      //getter
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }                        //setter

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("não pode isso não, ta errado esse preco");
        }
    }

    public void exibirProduto() {
        System.out.println("--------------------produto: " + nome + " // preco: R$ " + preco+ "___________________");
    }
}










