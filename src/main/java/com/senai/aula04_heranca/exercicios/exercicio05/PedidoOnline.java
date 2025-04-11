package com.senai.aula04_heranca.exercicios.exercicio05;

public class PedidoOnline extends Pedido{
    private double taxaEntrega;

    public PedidoOnline(int idPedido, double valorTotal, double taxaEntrega) {
        super(idPedido, valorTotal);
        this.taxaEntrega = taxaEntrega;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
}
