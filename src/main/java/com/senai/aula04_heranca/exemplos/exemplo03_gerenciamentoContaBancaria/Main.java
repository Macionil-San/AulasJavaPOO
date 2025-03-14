package com.senai.aula04_heranca.exemplos.exemplo03_gerenciamentoContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Juju" , 10000, 20000);
        ContaPoubanca contaPoubanca = new ContaPoubanca("bibi", 1000,10);

        contaPoubanca.exibirSaldo();
        contaCorrente.exibirSaldo();

        System.out.println("------TESTE CC------");
        contaCorrente.sacar(1000);
        contaCorrente.sacar(2000);
        contaCorrente.sacar(3000);
        System.out.println("-----------------------");

        System.out.println("--------TESTE CP------");
        contaPoubanca.aplicarRendimento();
        System.out.println("-----------------------");
    }
}
