package com.senai.aula04_heranca.exercicios.exercicio02;

public class Main {
    public static void main(String[] args) {


        System.out.println("--------DEFAULT-------");
        Funcionario funcionario1 = new Funcionario(
                "ruru",
                2000000,
                1
        );
        System.out.println(funcionario1);

        System.out.println("--------PRO-----------");
        Professor funcionario2 = new Professor(
                "Bianca", 12000,
                2, "MATEMATICA"
        );
        System.out.println(funcionario2);

    }
}




