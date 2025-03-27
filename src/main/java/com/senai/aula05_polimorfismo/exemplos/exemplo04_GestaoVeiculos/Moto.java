package com.senai.aula05_polimorfismo.exemplos.exemplo04_GestaoVeiculos;

public class Moto extends Veiculos {

    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Troca de oleo feita " + getModelo());
    }
}