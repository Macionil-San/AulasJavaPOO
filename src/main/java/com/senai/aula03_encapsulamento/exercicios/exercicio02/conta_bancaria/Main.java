package com.senai.aula03_encapsulamento.exercicios.exercicio02.conta_bancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancario conta01 = new ContaBancario("Ruan", 3000);
        System.out.println(conta01);
        ContaBancario conta02 = new ContaBancario("juia", 2000);
        System.out.println(conta02);

        System.out.println("----------------------------------------------------");
        System.out.println("DEPOSITAR: ");
        conta01.depositar(200);
        System.out.println("____________CONTA ATUALIZADA________________________ \n" + conta01);
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("SACAR: ");
        conta01.sacar(100);
        System.out.println("____________CONTA ATUALIZADA________________________ \n" + conta01);
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("TRANSFERIR: ");
        conta01.transferir(68, conta01);
        conta02.depositar(100);
        System.out.println("____________CONTA ATUALIZADA________________________ \n" + conta01);
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println(conta01);
        System.out.println(conta02);
        System.out.println("----------------------------------------------------");
    }


}
