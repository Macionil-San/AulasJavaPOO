package com.senai.aula01_introPOO.Exemplos.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String cabecalho[] = {"nome: ", "Idade: ", "alrura: ", "Endereço: \n\tRua: ", "\tNumero: ", "\tBairro: ", "\tCidade: ", "\tEstado: "};
        String dados[] = new String[8];
        System.out.println("Preencha as informações a seguir: ");

        for (int i = 0; i < cabecalho.length; i++) {
            System.out.print(cabecalho[i]);
            dados[i] = scanner.nextLine();
        }

        Endereco endereco = new Endereco(
                "estrada do alto",
                55,
                "caieiras",
                "sao paulo",
                "sp");


        Pessoa pessoa01 = new Pessoa(
                endereco,
                1.78F,
                17,
                "Ruan");

        Pessoa pessoa02 = new Pessoa(
                dados[0],
                Integer.parseInt((dados[1])),
                Float.parseFloat(dados[2]),
                new Endereco(
                        dados[3],
                        Integer.parseInt(dados[4]),
                        dados[5],
                        dados[6],
                        dados[7]
                )
        );


        System.out.println(pessoa01);
        System.out.println(pessoa02);

        pessoa01.comer("misto quente");
        pessoa02.comer("pão de batata");
    }
}
