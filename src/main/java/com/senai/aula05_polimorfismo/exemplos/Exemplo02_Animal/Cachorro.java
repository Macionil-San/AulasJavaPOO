package com.senai.aula05_polimorfismo.exemplos.Exemplo02_Animal;

public class Cachorro extends Animal{
    @Override
    void fazerSom() {
        System.out.println("O cachorro late: AUAU");
    }
}
