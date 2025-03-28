package com.senai.aula05_polimorfismo.exercicios.exercicio04;

public class SensoTemp extends Sensor {
    private String celsius = "°C";

    public SensoTemp(double medicao) {
        super(medicao);
    }

    @Override
    public void exibirMedicao() {
        System.out.println("temperatura: " + getMedicao() + " " + celsius);
    }
}
