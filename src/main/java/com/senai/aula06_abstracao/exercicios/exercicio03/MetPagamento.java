package com.senai.aula06_abstracao.exercicios.exercicio03;

abstract public class MetPagamento {
    protected String nomeUsuario;
    protected double valorTransacao;

    public MetPagamento(String nomeUsuario, double valorTransacao) {
        this.nomeUsuario = nomeUsuario;
        this.valorTransacao = valorTransacao;
    }

    abstract public void validacaoAntifraude();

    abstract public void autenticacaoPagamento();

}
