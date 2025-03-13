package com.senai.aula04_heranca.exemplos.exemplo02_sistemaDeCadastroUser;

public class Gerente extends Funcionario{
  private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirDsdos() {
        System.out.printf("Nome de funcionario: %S " + "\n Salario: %,3.2f", getNome(), (salario+bonus));
    }
}
