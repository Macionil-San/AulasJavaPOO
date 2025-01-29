package com.senai.Aula01_introPOO.Exemplos.pessoa;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco(
                "estrada do alto",
                55,
                "caieiras",
                "sao paulo",
                "sp");

        Pessoa pessoa01 = new Pessoa(
                "Rafael",
                40,
                1.75F,
                endereco);
        Pessoa pessoa02 = new Pessoa(
                endereco,
                1.78F,
                17,
                "Ruan");


        System.out.println(pessoa01);
        System.out.println(pessoa02);

        pessoa01.comer("misto quente");
        pessoa02.comer("pão de batata");
    }
}
