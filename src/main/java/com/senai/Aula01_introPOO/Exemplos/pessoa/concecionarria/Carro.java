package com.senai.Aula01_introPOO.Exemplos.pessoa.concecionarria;


public class Carro {
    String modelo;
    String marca;
    int ano;
    String cor;
    double preco;


    public Carro(String modelo, String marca, int ano, String cor, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                '}';
    }

    public void testeDriver() {
        System.out.println("Vruuuum " + modelo + " ligando");
    }

    public void comprar(String nomeCliente) {
        System.out.println("Parabéns " + nomeCliente + ", você comprou o " + modelo);
    }

    public void valorFinal(int anoAtual) {
        double valoFinal = preco;
        int idade = anoAtual - ano;

        for (int i = 0; i < idade; i++) {
            valoFinal -= (valoFinal * 0.02);
        }

        System.out.println("valor atual do carro " + modelo + "com a desvalorização de 2% ao ano será R$: " + String.format("%.2f",valoFinal)) ;

    }
}




