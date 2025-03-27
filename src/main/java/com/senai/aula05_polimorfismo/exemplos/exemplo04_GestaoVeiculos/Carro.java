package com.senai.aula05_polimorfismo.exemplos.exemplo04_GestaoVeiculos;

public class Carro extends Veiculos{
    public Carro(String modelo){
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutencao preventiva feita no " +  getModelo() + " negoo");
    }
}
