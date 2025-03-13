package com.senai.aula04_heranca.exemplos.gerenciamentoContaBancaria;

import java.util.Scanner;

public class ContaCorrente extends ContaBancaria {
    private double limite;


    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
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

}


