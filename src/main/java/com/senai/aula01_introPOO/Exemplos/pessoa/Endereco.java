package com.senai.aula01_introPOO.Exemplos.pessoa;

public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String estado;


    @Override
    public String toString() {
        return "rua " + rua + ", " + numero + ", " + bairro + ", " + cidade + "-" + estado;
    }

    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
}
