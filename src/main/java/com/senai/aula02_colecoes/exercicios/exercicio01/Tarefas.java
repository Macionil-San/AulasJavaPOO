package com.senai.aula02_colecoes.exercicios.exercicio01;

import java.util.ArrayList;

public class Tarefas {

String nome;
boolean conclusao;



    @Override
    public String toString() {
        return nome + " está " + conclusao;
    }

    public Tarefas(String nome, boolean conclusao) {

        this.nome = nome;
        this.conclusao = conclusao;
    }
}
