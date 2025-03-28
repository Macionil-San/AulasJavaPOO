package com.senai.aula05_polimorfismo.exercicios.exercicio04;

public class Sensor {
    private double medicao;

    public Sensor(double medicao) {
        this.medicao = medicao;
    }

    public double getMedicao() {
        return medicao;
    }

    public void setMedicao(double medicao) {
        this.medicao = medicao;
    }


    public void exibirMedicao() {
        System.out.println("Medição genérica: " + medicao);
    }
}
