package com.senai.aula04_heranca.exemplos.exemplo01_veiculos;

public class Veiculo {
    private String Marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        Marca = marca;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "Marca='" + Marca + '\'' +
                ", ano=" + ano +
                '}';
    }


    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDetalhes(){
        System.out.println("Marca: ");
    }

}
