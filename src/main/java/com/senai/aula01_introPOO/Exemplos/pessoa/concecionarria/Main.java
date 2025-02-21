package com.senai.aula01_introPOO.Exemplos.pessoa.concecionarria;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro(
                "Mustang",
                "Ford",
                2022,
                "azul,",
                200000);

        Carro carro2 = new Carro(
                "civic-type-R",
                "Honda",
                2015,
                "Preto,",
                150000);

        System.out.println(carro1);
        System.out.println(carro2);
        carro1.testeDriver();
        carro1.comprar("Rafael");
        carro1.valorFinal(2025);
        carro2.testeDriver();
        carro2.comprar("Ruan");
        carro2.valorFinal(2025);



    }
}
