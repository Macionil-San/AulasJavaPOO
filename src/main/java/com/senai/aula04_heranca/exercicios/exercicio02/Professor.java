package com.senai.aula04_heranca.exercicios.exercicio02;

public class Professor extends Funcionario {
private String disciplina;


    public Professor(String nome, double salario, int idCargo, String disciplina) {
        super(nome, salario, idCargo);
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "disciplina ='" + disciplina + '\'' +
                '}';
    }

}
