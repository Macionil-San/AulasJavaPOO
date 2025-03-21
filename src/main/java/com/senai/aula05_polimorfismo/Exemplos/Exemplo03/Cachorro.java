package com.senai.aula05_polimorfismo.Exemplos.Exemplo03;

public class Cachorro extends Animal{
    @Override
    void fazerSom() {
        System.out.println("O cachorro late: AUAU");
    }
}
