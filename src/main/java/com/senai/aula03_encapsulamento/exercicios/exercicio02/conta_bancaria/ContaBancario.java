package com.senai.aula03_encapsulamento.exercicios.exercicio02.conta_bancaria;

import java.util.Scanner;

public class ContaBancario {

    private String titular;
    private double saldo;

    public ContaBancario(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("não pode isso não, ta errado esse saldo");
        }

    }

    public String getTitular() {                      //getter
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;                         //setter
    }                                                     //setter

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    @Override
    public String toString() {
        return "ContaBancario { " +
                " titular = '" + titular + '\'' +
                ", saldo = " + saldo +
                "" + '}';
    }

    public void depositar() {
        double valor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite quanto deseja depositar: ");
        valor = scanner.nextDouble();
        if (valor > 0) {
            saldo += valor;
            System.out.println("depositado com sucesso!!!");
        } else {
            System.out.println("--------------INVALIDO-----------");
        }

    }

    public void sacar() {
        double valor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite quanto deseja sacar: ");
        valor = scanner.nextDouble();
        if (valor > 0 && valor < saldo) {

            saldo -= valor;
            System.out.println("sacado com sucesso!!!");
        } else if ( saldo < valor){
            System.out.println("--------------SE NÃO TEM DIM DIM-----------");
            saldo = saldo;
        } else {
            System.out.println("--------------INVALIDO-----------");
        }

    }
}
