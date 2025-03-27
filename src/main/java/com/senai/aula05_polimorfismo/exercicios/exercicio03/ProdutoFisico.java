package com.senai.aula05_polimorfismo.exercicios.exercicio03;

public class ProdutoFisico extends Produto {
    private double impostos;

    public ProdutoFisico(String nome, double preco, double imposto) {
        super(nome, preco);
        this.impostos = imposto;
    }

    @Override
    public double calcularImposto() {
        return preco * (1 + impostos);
    }
}