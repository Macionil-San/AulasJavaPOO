package com.senai.aula03_encapsulamento.exemplos.carro;

public class Main {
    public static void main(String[] args) {
        //criando um objeto de classe carro
        Carro meuCarro = new Carro();

        //utilizando métodos públicos para modificar e acessar a acessar a variável privada
        meuCarro.setVelocidade(100);
        System.out.println("Velocidade atual: " + meuCarro.getVelocidade());

        //Testando uma velocidade invalida
        meuCarro.setVelocidade(-20);
    }
}
