package com.senai.aula06_abstracao.exemplos.exemplo_classe_interface.exemplo01;

public class Computador implements AparelhoEletronico{
    @Override
    public void ligar() {
        System.out.println("PC ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Pc desligado");
    }
}
