package com.senai.aula04_heranca.exercicios.exercicio05;

public class Pedido {
    private int idPedido;
    private double valorTotal;

    public Pedido(int idPedido, double valorTotal) {
        this.idPedido = idPedido;
        this.valorTotal = valorTotal;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
