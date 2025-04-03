package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.exemplo01_;

public class Pato extends Animal {

    public Pato(String nome) {
        super(nome);

    }

    @Override
    void fazerSom() {
        System.out.println(nome+" fez quack quack");
    }

    void botarOvo() {
        System.out.println(nome + " virou mamãe!!");

    }
}
