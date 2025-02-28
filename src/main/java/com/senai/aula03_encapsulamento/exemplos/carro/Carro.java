package com.senai.aula03_encapsulamento.exemplos.carro;

public class Carro {
    private int velocidade;

    //construtor
    public Carro(){
        velocidade = 0; //iniciando o carro está parado
    }

    //metodo publico para OBTER velocidade (GETTER)
    public  int getVelocidade(){
        return velocidade;
    }

    //metodo publico para DEFINIR velocidade (SETTER)
    public void setVelocidade(int velocidade){

        if (velocidade >= 0){  //regra, velocidade não pode ser negativa
            this.velocidade = velocidade;
        }else {
            System.out.println("Velociade invalida");
        }
    }
}



