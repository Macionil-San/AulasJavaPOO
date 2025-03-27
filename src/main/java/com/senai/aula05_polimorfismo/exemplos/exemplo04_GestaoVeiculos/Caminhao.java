package com.senai.aula05_polimorfismo.exemplos.exemplo04_GestaoVeiculos;

public class Caminhao extends Veiculos {
    public Caminhao(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Verificacao de freios realixzada com sucesso no caminhao " + getModelo());
    }
}