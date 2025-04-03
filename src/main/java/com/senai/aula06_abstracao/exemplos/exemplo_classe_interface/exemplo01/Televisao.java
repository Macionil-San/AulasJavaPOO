package com.senai.aula06_abstracao.exemplos.exemplo_classe_interface.exemplo01;

public class Televisao implements AparelhoEletronico{
    @Override
    public void ligar() {
        System.out.println("TV ligada");
    }

    @Override
    public void desligar() {
        System.out.println("TV desligada");
    }
}
