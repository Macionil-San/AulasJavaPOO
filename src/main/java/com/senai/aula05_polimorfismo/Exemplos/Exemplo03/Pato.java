package com.senai.aula05_polimorfismo.Exemplos.Exemplo03;

public class Pato extends Animal{
    @Override
    void fazerSom() {
        System.out.println("O  pato late: quack quack");
    }
    void voar() {
        System.out.println("to voando quack quack");
    }
}
