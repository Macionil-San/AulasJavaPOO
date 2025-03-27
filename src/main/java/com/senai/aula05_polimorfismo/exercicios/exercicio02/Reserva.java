package com.senai.aula05_polimorfismo.exercicios.exercicio02;

public class Reserva {
    private String nomeCliente;
    private double diaria;
    private double alimentacao;
    private int qtdDias;
    private double valorTotal;

    public Reserva(String nomeCliente, double diaria, double alimentacao, int qtdDias, double valorTotal) {
        this.nomeCliente = nomeCliente;
        this.diaria = diaria;
        this.alimentacao = alimentacao;
        this.qtdDias = qtdDias;
        this.valorTotal = valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public double getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(double alimentacao) {
        this.alimentacao = alimentacao;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double calcularReserva() {
        return qtdDias*diaria;
    }
}
