package com.senai.aula05_polimorfismo.exercicios.exercicio04;

public class SensorTemp extends Sensor {
    private double graus;

    public SensorTemp(double medida, double graus) {
        super(medida);
        this.graus = graus;
    }

}

