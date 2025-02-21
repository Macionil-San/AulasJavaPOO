package com.senai.aula03_encapsulamento.exercicios.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancario conta01 = new ContaBancario("Ruan", 3000);
        System.out.println(conta01);

        System.out.println("deposiatar: ");
        conta01.depositar();
        System.out.println("____________CONTA ATUALIZADA__________ \n" + conta01);
    }


}
