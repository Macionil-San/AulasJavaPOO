package com.senai.aula05_polimorfismo.exercicios.exercicio03;

public class ProdutoServico extends Produto {
    private double impotos;

    public ProdutoServico(String nome, double preco, double imposto) {
        super(nome, preco);
        this.impotos = imposto;
    }


    @Override
    public double calcularImposto() {
        return preco * (1 + impotos);
    }
}