package com.senai.aula05_polimorfismo.exemplos.exemplo04_GestaoVeiculos;

public class Main {
    public static void main(String[] args) {


        realizarManutencao(new Carro("Totoya Supra"));
        realizarManutencao(new Moto("Mamara 250"));
        realizarManutencao(new Caminhao("Volvo FH"));
    }


    private static void realizarManutencao(Veiculos veiculos) {
        veiculos.realizarManutencao();
    }
}
