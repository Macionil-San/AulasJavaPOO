package com.senai.Aula01_introPOO.Exemplos.pessoa;

public class Pessoa {
    String nome;
    int idade;
    float altura;
    String endereco;

    public Pessoa(String nome, int idade,float altura, String endereco){

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.endereco = endereco;
    }

    public void falar(String frase){
        System.out.println("A pessoa falou: " + frase);
    }

    public void comer(String alimento){
        System.out.println("A pessoa comeu: " + alimento);
    }

}
