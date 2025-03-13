package com.senai.aula04_heranca.exemplos.exemplo02_sistemaDeCadastroUser;

public class Funcionario {
    private String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirDsdos() {
        System.out.printf("Nome de funcionario: %S " + "\n Salario: %,3.2f", nome, salario);
    }

}
