package com.senai.aula05_polimorfismo.exercicios.exercicio01;


public class Main {

    public static void main(String[] args) {
        GerarRelatorio(new CSV());
        GerarRelatorio(new PDF());
        GerarRelatorio(new Json());

    }
    private static void GerarRelatorio(Relatorio relatorio) {
        relatorio.gerarRelatorio();
    }
}
