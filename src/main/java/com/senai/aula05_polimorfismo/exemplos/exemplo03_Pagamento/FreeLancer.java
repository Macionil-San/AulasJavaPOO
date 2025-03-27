package com.senai.aula05_polimorfismo.exemplos.exemplo03_Pagamento;

public class FreeLancer extends Pagamento{
    private double valorProjeto;


    public FreeLancer(String nome, double valorProjeto) {
        super(nome);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularPagamento() {
        return valorProjeto;
    }
}
