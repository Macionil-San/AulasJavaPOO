package com.senai.Aula01_introPOO.exercicios.produto;

import com.senai.Aula01_introPOO.Exemplos.pessoa.Endereco;
import com.senai.Aula01_introPOO.Exemplos.pessoa.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Produto produto01 = new Produto(
                "arooz",
                25.99F,
                50
        );


        System.out.println(produto01);

        System.out.println("Qauntos " + produto01.nome + "você pegou do estoque?: " );
        produto01.quantidade -= Integer.parseInt(scanner.nextLine());

        System.out.println(produto01);
    }
}
