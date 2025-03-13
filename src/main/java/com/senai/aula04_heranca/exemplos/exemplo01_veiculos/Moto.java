package com.senai.aula04_heranca.exemplos.exemplo01_veiculos;

public class Moto extends Veiculo{
    private boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica){
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }


}
