package com.senai.aula03_encapsulamento.exercicios.exercicio02.conta_bancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancario conta01 = new ContaBancario("Ruan", 3000);
        System.out.println(conta01);

        System.out.println("DEPOSITAR: ");
        conta01.depositar();
        System.out.println("____________CONTA ATUALIZADA__________ \n" + conta01);

        System.out.println("SACAR: ");
        conta01.sacar();
        System.out.println("____________CONTA ATUALIZADA__________ \n" + conta01);

    }


}
