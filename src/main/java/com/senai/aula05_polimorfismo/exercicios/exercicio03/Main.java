package com.senai.aula05_polimorfismo.exercicios.exercicio03;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Produto> listaTotal = new ArrayList<>();
        listaTotal.add(new ProdutoFisico("geladeira: ", 2200, 0.20));
        listaTotal.add(new ProdutoDigital("microondas: ", 200, 0.30));
        listaTotal.add(new ProdutoServico("lavadeira: ", 800, 0.25));

        listaTotal.forEach(produto -> System.out.println(produto.getNome() + produto.calcularImposto()));
    }
}

