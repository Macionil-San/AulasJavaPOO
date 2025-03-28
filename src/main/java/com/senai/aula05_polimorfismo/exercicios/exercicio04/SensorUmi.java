package com.senai.aula05_polimorfismo.exercicios.exercicio04;

public class SensorUmi extends Sensor {
    private String umidade;

    public SensorUmi(double medicao, String umidade) {
        super(medicao);
        this.umidade = umidade;
    }

    @Override
    public void exibirMedicao() {
        System.out.println("umidade: " + getMedicao() + " " + umidade);
    }
}
