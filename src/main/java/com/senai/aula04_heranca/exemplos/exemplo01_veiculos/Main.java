package com.senai.aula04_heranca.exemplos.exemplo01_veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro=new Carro ("honda", 2015, 4);
        Moto moto =new Moto("harley", 2015, true);

        carro.exibirDetalhes();
        moto.exibirDetalhes();
    }
}
