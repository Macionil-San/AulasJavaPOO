package com.senai.aula04_heranca.exercicios.exercicio01;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;



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


    public void exibirProduto(){
        System.out.printf("Nome do pproduto: %s " + "\n Preço: %,3.2f"+ "\n Quantidade: "+ quantidade, nome, preco);
    }

}





