package com.senai.aula06_abstracao.exemplos.exemplo_classe_interface.exemplo01;

public class Main {
    public static void main(String[] args) {
testarAparelhos(new Televisao());
testarAparelhos(new Computador());

    }
    public static void testarAparelhos(AparelhoEletronico aparelhoEletronico){
        System.out.println("-------testandoo aparelhos--------");
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}

