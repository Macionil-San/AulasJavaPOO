package com.senai.Aula01_introPOO.Exemplos.pessoa;

public class Pessoa {
    String nome;
    int idade;
    float altura;
    Endereco endereco;

    public Pessoa(String nome, int idade, float altura, Endereco endereco) {

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.endereco = endereco;
    }

    public Pessoa(Endereco endereco, float altura, int idade, String nome) {
        this.endereco = endereco;
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }

    public void falar(String frase) {
        System.out.println(nome + "falou: " + frase);
    }

    public void comer(String alimento) {
        System.out.println( nome+ " comeu: " + alimento);
    }

    @Override
    public String toString() {
        return "O nome da pessoa é " + this.nome + ", tem " + this.idade + " anos " + this.altura + " de altura e mora no endereço " + this.endereco;
    }
}
