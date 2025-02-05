package com.senai.Aula01_introPOO.exercicios.gerenciamentoAluno;

public class Aluno {
    String nome;
    int idade;
    float nota;

    @Override
    public String toString() {
        return "Aluno: " + nome+ ", Idade: " +idade + ", Nota " + nota ;
    }

    public Aluno(String nome, int idade, float nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }


}
