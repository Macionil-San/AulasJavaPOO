package com.senai.aula05_polimorfismo.exemplos.exemplo04_GestaoVeiculos;

public class Veiculos {
    private String modelo;

    public Veiculos(String modelo) {
        this.modelo = modelo;
    }

    public void realizarManutencao(){
        System.out.println("manutrção generica");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
