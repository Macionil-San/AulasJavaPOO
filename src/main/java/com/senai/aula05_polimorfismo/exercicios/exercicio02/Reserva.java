package com.senai.aula05_polimorfismo.exercicios.exercicio02;

public class Reserva {
    private String cliente;
    private double diaria;
    private double alimentacao;
    private int diasFicados;
    private double valorTotal;

    public Reserva(String nomeCliente, double diaria, double alimentacao, int qtdDias, double valorTotal) {
        this.cliente = nomeCliente;
        this.diaria = diaria;
        this.alimentacao = alimentacao;
        this.diasFicados = qtdDias;
        this.valorTotal = valorTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
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

    public int getDiasFicados() {
        return diasFicados;
    }

    public void setDiasFicados(int diasFicados) {
        this.diasFicados = diasFicados;
    }

    public double getValorTotal() {
        return valorTotal;
    }


    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double calcularReserva() {
        return diasFicados *diaria;
    }
}
