package com.senai.aula04_heranca.exercicios.exercicio04;

public class Paciente {
    private String nome;
    private int idade;
    private double precoConsulta;

    public Paciente(String nome, int idade, double custoConsulta) {
        this.nome = nome;
        this.idade = idade;
        this.precoConsulta = custoConsulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPrecoConsulta() {
        return precoConsulta;
    }

    public void setPrecoConsulta(double precoConsulta) {
        this.precoConsulta = precoConsulta;
    }
}
