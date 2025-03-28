package com.senai.aula05_polimorfismo.exercicios.exercicio04;

public class Main {
    public static void main(String[] args) {


        Sensor sensor1 = new SensorUmi(75.5, "%");
        Sensor sensor2 = new SensoTemp(25.3);

        sensor1.exibirMedicao();
        sensor2.exibirMedicao();
    }
}
