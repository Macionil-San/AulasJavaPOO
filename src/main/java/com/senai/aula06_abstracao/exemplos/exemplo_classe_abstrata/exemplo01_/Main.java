package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.exemplo01_;

public class Main {
    public static void main(String[] args) {
        testarAnimal(new Pato("jubriscreudu"));
    }

    private static void testarAnimal(Animal animal) {
        animal.dormir();
        animal.fazerSom();
        if (animal instanceof Pato pato) {
            pato.botarOvo();
        }
    }


}
