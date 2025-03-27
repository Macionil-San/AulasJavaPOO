package com.senai.aula05_polimorfismo.exercicios.exercicio02;

public class ReservaVip extends Reserva {
    private double descotoVIP;

    public ReservaVip(String nomeCliente, double diaria, double alimentacao, int qtdDias, double valorTotal, double descotoVIP) {
        super(nomeCliente, diaria, alimentacao, qtdDias, valorTotal);
        this.descotoVIP = descotoVIP;
    }

    @Override
    public double calcularReserva() {
        double decontoVip = 40;
        return super.calcularReserva()-decontoVip;
    }
}