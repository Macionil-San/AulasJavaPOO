package com.senai.aula05_polimorfismo.exemplos.Exemplo02_Animal;

public class Pato extends Animal{
    @Override
    void fazerSom() {
        System.out.println("O  Pato late: quack quack");
    }
    void voar() {
        System.out.println("to voando quack quack");
    }
}
