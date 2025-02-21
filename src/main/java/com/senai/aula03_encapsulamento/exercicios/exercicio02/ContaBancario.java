package com.senai.aula03_encapsulamento.exercicios.exercicio02;

import java.util.Scanner;

public class ContaBancario {

    private String titular;
    private double saldo;

    public ContaBancario(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0) {
            this.saldo = saldo;
        }else {
            throw new IllegalArgumentException("não pode isso não, ta errado esse saldo");
        }

    }

    public String getTitular() {                      //getter
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }                                                     //setter

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;

    }

    @Override
    public String toString() {
        return "ContaBancario { " +
                " titular = '" + titular + '\'' +
                ", saldo = " + saldo +
                "" + '}';
    }

    public void depositar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite quanto deseja depositar: ");
        saldo += scanner.nextInt();
        System.out.println("depositado com sucesso!!!");

    }



}
