package com.senai.aula04_heranca.exemplos.gerenciamentoContaBancaria;

public class ContaPoubanca extends ContaBancaria{
private double taxaDeRendimento;


    public ContaPoubanca(String titular, double saldo, double taxaDeRendimento) {
        super(titular, saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public void aplicarRendimento(){
        saldo +=(saldo*taxaDeRendimento)/100;
    }
}
