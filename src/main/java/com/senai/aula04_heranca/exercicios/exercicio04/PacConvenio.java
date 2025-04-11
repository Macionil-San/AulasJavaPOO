package com.senai.aula04_heranca.exercicios.exercicio04;

public class PacConvenio extends Paciente{
    private double descontoCustoConsulta;

    public PacConvenio(String nome, int idade, double custoConsulta, double descontoCustoConsulta) {
        super(nome, idade, custoConsulta);
        this.descontoCustoConsulta = descontoCustoConsulta;
    }


    public double getDescontoCustoConsulta() {
        return descontoCustoConsulta;
    }

    public void setDescontoCustoConsulta(double descontoCustoConsulta) {
        this.descontoCustoConsulta = descontoCustoConsulta;
    }
}

