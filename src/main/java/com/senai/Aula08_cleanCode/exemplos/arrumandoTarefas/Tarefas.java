package com.senai.Aula08_cleanCode.exemplos.arrumandoTarefas;

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
