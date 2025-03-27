package com.senai.aula05_polimorfismo.exemplos.exemplo03_Pagamento;

public class PJ extends Pagamento{
private double HorasTrabalhadas;
private double valorPorHora;


    public PJ(String nome, double horasTrabalhadas, double valorPorHora) {
        super(nome);
        this.HorasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;

    }

    @Override
    public double calcularPagamento() {
        return HorasTrabalhadas * valorPorHora;
    }
}
