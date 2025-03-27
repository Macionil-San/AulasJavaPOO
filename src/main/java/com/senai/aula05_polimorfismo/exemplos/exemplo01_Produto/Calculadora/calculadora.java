package com.senai.aula05_polimorfismo.exemplos.exemplo01_Produto.Calculadora;

public class calculadora {
    int somar(int a, int b) {
        return a + b;


    }

    int somar(int a, int b, int c) {                    //Criar um construtor pra cada
        return a + b + c;
    }

    double somar(double a, double b) {
        return a + b;
    }


}
