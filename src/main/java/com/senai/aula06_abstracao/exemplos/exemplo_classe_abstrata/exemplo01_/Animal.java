package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.exemplo01_;

public abstract class Animal {
  protected  String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void dormir(){
        System.out.println(nome + " está dormindo");
    }

    abstract void fazerSom();

}
