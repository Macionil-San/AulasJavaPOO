package com.senai.aula05_polimorfismo.exercicios.exercicio04;

public class SensorUni extends Sensor{
    private double umidade;

    public SensorUni(double medida, double graus) {
        super(medida);
        this.umidade = graus;
    }

}
