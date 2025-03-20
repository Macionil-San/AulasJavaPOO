package com.senai.aula02_colecoes.exercicios.exercicio02;

public class Produto {
    protected String nome;
    protected double preco;
    protected int quantidade;



    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        setPreco(preco);
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("não pode isso não, ta errado esse preco");
        }
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
