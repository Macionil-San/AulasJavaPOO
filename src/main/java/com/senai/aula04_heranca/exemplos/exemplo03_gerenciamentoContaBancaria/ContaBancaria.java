package com.senai.aula04_heranca.exemplos.exemplo03_gerenciamentoContaBancaria;

import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void deposito(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("não pode isso não, ta errado esse saldo");
        }
    }

    public void sacar(double valor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite quanto deseja sacar: ");
        valor = scanner.nextDouble();
        if (valor > 0 && valor < saldo) {

            saldo -= valor;
            System.out.println("sacado com sucesso!!!");
        } else if (saldo < valor) {
            System.out.println("--------------SE NÃO TEM DIM DIM-----------");
            saldo = saldo;
        } else {
            System.out.println("--------------INVALIDO-----------");
        }
    }

    public void exibirSaldo(){
        System.out.println("Titilar: %s , Saldo: R$.2f \n" );
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }





}
