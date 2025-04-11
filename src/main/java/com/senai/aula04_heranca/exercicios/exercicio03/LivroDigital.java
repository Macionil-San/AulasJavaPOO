package com.senai.aula04_heranca.exercicios.exercicio03;

public class LivroDigital extends Livro {
    private double tamArquivo;

    public LivroDigital(String titulo, String autor, double tamArquivo) {
        super(titulo, autor);
        this.tamArquivo = tamArquivo;
    }

    public double getTamArquivo() {
        return tamArquivo;
    }

    public void setTamArquivo(double tamArquivo) {
        this.tamArquivo = tamArquivo;
    }
}
