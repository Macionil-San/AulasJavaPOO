package com.senai.aula05_polimorfismo.exemplos.Exemplo02_Animal;

public class Main {
    public static void main(String[] args) {
      //  testarSomAnimal(new Cachorro());
        testarSomAnimal(new Pato());
    }

    public static void testarSomAnimal(Animal animal) {
        animal.fazerSom();
        Pato pato = (Pato) animal;
        pato.voar();
    }
}
