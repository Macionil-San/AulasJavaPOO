package com.senai.aula03_encapsulamento.exercicios.exercicio01;

public class Main {
    public static void main(String[] args) {


        Produto produto01 = new Produto("Notebook", 2500.00);
        produto01.exibirProduto();

        produto01.setPreco(-500.00); // Isso deve exibir uma mensagem de erro
        produto01.exibirProduto();
    }
}

