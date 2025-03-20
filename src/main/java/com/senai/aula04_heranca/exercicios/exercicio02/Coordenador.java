package com.senai.aula04_heranca.exercicios.exercicio02;

public class Coordenador extends Funcionario {
    private String[] equipeProfessor;


    public Coordenador(String nome, double salario, int idCargo, String[] equipeProfessor) {
        super(nome, salario, idCargo);
        this.equipeProfessor = new String[]{equipeProfessor[2]};
    }

}


