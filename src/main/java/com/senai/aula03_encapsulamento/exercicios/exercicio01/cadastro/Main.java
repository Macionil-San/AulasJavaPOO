package com.senai.aula03_encapsulamento.exercicios.exercicio01.cadastro;

public class Main {
    public static void main(String[] args) {


        Produto produto01 = new Produto("Notebook", 2500.00);
        produto01.exibirProduto();

        produto01.setPreco(-500.00); // exibi uma mensagem de erro
        produto01.exibirProduto();
    }
}

